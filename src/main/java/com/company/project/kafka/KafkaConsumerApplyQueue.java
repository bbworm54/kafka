package com.company.project.kafka;

import com.alibaba.fastjson.JSON;
import com.company.project.configurer.kafkaConsumerConfigurer;
import com.company.project.model.ApplyQueue;
import com.company.project.service.WmUserMoneyService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collections;

@Component

public class KafkaConsumerApplyQueue {


    @Resource
    private WmUserMoneyService moneyService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @KafkaListener
    public void begin() throws Exception{

        if (System.getProperty("java.security.auth.login.config") == null) {
            System.setProperty("java.security.auth.login.config",  KafkaConsumerApplyQueue.class.getClassLoader().getResource("kafka_client_jaas.conf").getPath());
        }
        String  topic = System.getProperty("kafka.ons.TOPIC", "TestB_Topic");


        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(kafkaConsumerConfigurer.INSTANCE.getInstance());
        consumer.subscribe(Collections.singletonList(topic));
        while (true){
            ConsumerRecords<String, String> records = consumer.poll(200);
            logger.info("拉取数据条数："+records.count());
            if (records != null && records.count()>0){
                for (ConsumerRecord<String, String> record : records) {

                ApplyQueue aq = JSON.parseObject(record.value(), ApplyQueue.class);
                if (aq != null){
                    System.out.println(1);
                }
//                System.out.println(aq.getAmount());
//
//
//                if (Integer.valueOf(aq.getAmount())>1000){
//                    KafkaProducer<String, String> producer = new KafkaProducer<String, String>(kafkaProducerConfig.INSTANCE.getInstance());
//                    String message = JSON.toJSONString(aq);
//                    producer.send(new ProducerRecord<String, String>(
//                            topic,
//                            null,
//                            System.currentTimeMillis(),
//                            String.valueOf(message.hashCode()),
//                            message));
//
//                    producer.flush();
//                }

                    System.out.println("message:"+record.value());
                    System.out.println(String.format("Consume partition:%d offset:%d", record.partition(), record.offset()));
                }
            }

            consumer.commitSync();
        }
    }
}
