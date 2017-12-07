package com.company.project.configurer;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.config.SaslConfigs;
import org.apache.kafka.common.config.SslConfigs;

import java.util.Properties;

/**
 * @author Administrator
 */

public enum kafkaProducerConfigurer {

    INSTANCE;

    private Properties instance;

    private String BOOTSTRAP_SERVERS_CONFIG = "SASL_SSL://kafka-ons-internet.aliyun.com:8080";
    private String SSL_TRUSTSTORE_LOCATION_CONFIG = kafkaProducerConfigurer.class.getClassLoader().getResource("kafka.client.truststore.jks").getPath();
    private String SSL_TRUSTSTORE_PASSWORD_CONFIG="KafkaOnsClient";
    private String SECURITY_PROTOCOL_CONFIG="SASL_SSL";
    private String SASL_MECHANISM="ONS";
    private Integer RETRIES_CONFIG=0;
    private String KEY_SERIALIZER_CLASS_CONFIG="org.apache.kafka.common.serialization.StringSerializer";
    private String VALUE_SERIALIZER_CLASS_CONFIG="org.apache.kafka.common.serialization.StringSerializer";
    private Integer MAX_BLOCK_MS_CONFIG=30 * 1000;


    kafkaProducerConfigurer() {
        instance = new Properties();
        instance.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS_CONFIG);
        instance.put(SslConfigs.SSL_TRUSTSTORE_LOCATION_CONFIG,SSL_TRUSTSTORE_LOCATION_CONFIG);
        instance.put(SslConfigs.SSL_TRUSTSTORE_PASSWORD_CONFIG, SSL_TRUSTSTORE_PASSWORD_CONFIG);
        instance.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, SECURITY_PROTOCOL_CONFIG);
        instance.put(SaslConfigs.SASL_MECHANISM, SASL_MECHANISM);
        instance.put(ProducerConfig.RETRIES_CONFIG, RETRIES_CONFIG);
        instance.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, KEY_SERIALIZER_CLASS_CONFIG);
        instance.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, VALUE_SERIALIZER_CLASS_CONFIG);
        instance.put(ProducerConfig.MAX_BLOCK_MS_CONFIG, MAX_BLOCK_MS_CONFIG);
    }
    public Properties getInstance() {
        return instance;
    }

}
