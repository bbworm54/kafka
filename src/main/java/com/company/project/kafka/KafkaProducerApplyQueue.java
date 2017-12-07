package com.company.project.kafka;

import com.alibaba.fastjson.JSON;
import com.company.project.configurer.kafkaProducerConfigurer;
import com.company.project.model.ApplyQueue;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class KafkaProducerApplyQueue {

    public static void main(String args[]) {
        if (System.getProperty("java.security.auth.login.config") == null) {
            System.setProperty("java.security.auth.login.config",  KafkaProducerApplyQueue.class.getClassLoader().getResource("kafka_client_jaas.conf").getPath());
        }



        String  topic = System.getProperty("kafka.ons.TOPIC", "TestB_Topic");

            KafkaProducer<String, String> producer = new KafkaProducer<String, String>(kafkaProducerConfigurer.INSTANCE.getInstance());


            ApplyQueue applyQueue = new ApplyQueue();
            applyQueue.setUUID("1");
            applyQueue.setFlag("C");
            applyQueue.setTxtype("HSB");
        for (int i = 0; i <20 ; i++) {
            applyQueue.setAmount(String.valueOf(i));
            applyQueue.setTxid("20171206111726");
            String message = JSON.toJSONString(applyQueue);
            producer.send(new ProducerRecord<String, String>(
                    topic,
                    null,
                    System.currentTimeMillis(),
                    String.valueOf(message.hashCode()),
                    message));


        }
        producer.flush();
//        Future<RecordMetadata> metadataFuture = producer.send(new ProducerRecord<String, String>(
//            topic,
//            null,
//            System.currentTimeMillis(),
//            String.valueOf(message.hashCode()),
//            message));
//        try {
//            RecordMetadata recordMetadata = metadataFuture.get();
//            System.out.println("produce ok:" + recordMetadata.toString());
//        } catch (Exception e) {
//            System.out.println("error occurred");
//            e.printStackTrace();
//        }
//        producer.flush();

    }
}
