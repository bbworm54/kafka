package com.company.project.configurer;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.config.SaslConfigs;
import org.apache.kafka.common.config.SslConfigs;

import java.util.Properties;

/**
 * @author Administrator
 */

public enum kafkaConsumerConfigurer {

    INSTANCE;

    private Properties instance;

    private String BOOTSTRAP_SERVERS_CONFIG = "SASL_SSL://kafka-ons-internet.aliyun.com:8080";
    private String SSL_TRUSTSTORE_LOCATION_CONFIG = kafkaConsumerConfigurer.class.getClassLoader().getResource("kafka.client.truststore.jks").getPath();
    private String SSL_TRUSTSTORE_PASSWORD_CONFIG="KafkaOnsClient";
    private String SECURITY_PROTOCOL_CONFIG="SASL_SSL";
    private String SASL_MECHANISM="ONS";
    private String ENABLE_AUTO_COMMIT_CONFIG="true";
    private String AUTO_COMMIT_INTERVAL_MS_CONFIG = "1000";
    private String SESSION_TIMEOUT_MS_CONFIG = "30000";
    private String KEY_SERIALIZER_CLASS_CONFIG="org.apache.kafka.common.serialization.StringDeserializer";
    private String VALUE_DESERIALIZER_CLASS_CONFIG="org.apache.kafka.common.serialization.StringDeserializer";
    private String GROUP_ID_CONFIG=System.getProperty("kafka.ons.CID","CID_TestB_01");


    kafkaConsumerConfigurer() {
        instance = new Properties();
        instance.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS_CONFIG);
        instance.put(SslConfigs.SSL_TRUSTSTORE_LOCATION_CONFIG, SSL_TRUSTSTORE_LOCATION_CONFIG);
        instance.put(SslConfigs.SSL_TRUSTSTORE_PASSWORD_CONFIG, SSL_TRUSTSTORE_PASSWORD_CONFIG);
        instance.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, SECURITY_PROTOCOL_CONFIG);
        instance.put(SaslConfigs.SASL_MECHANISM, SASL_MECHANISM);
        instance.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, ENABLE_AUTO_COMMIT_CONFIG);
        instance.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, AUTO_COMMIT_INTERVAL_MS_CONFIG);
        instance.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, SESSION_TIMEOUT_MS_CONFIG);
        instance.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, KEY_SERIALIZER_CLASS_CONFIG);
        instance.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, VALUE_DESERIALIZER_CLASS_CONFIG);
        instance.put(ConsumerConfig.GROUP_ID_CONFIG, GROUP_ID_CONFIG);
    }
    public Properties getInstance() {
        return instance;
    }

}
