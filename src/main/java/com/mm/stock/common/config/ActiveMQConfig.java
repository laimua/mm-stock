/**
 * Copyright: Copyright (c) 2020 
 * Company:Siemens Power Automation Ltd. 
 * 
 * @author Meng1
 * @date 2020年4月28日 下午4:24:16
 * @version V1.0.0
 */
package com.mm.stock.common.config;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;

import com.mm.stock.common.constants.ActiveMQConstants;

/**
  * @ClassName: ActiveMQConfig
  * @Description: TODO
  * @author Meng1
  * @date 2020年4月28日 下午4:24:16
  *
  */
@Configuration
public class ActiveMQConfig {
    
    @Value("${${spring.activemq.broker-url}:}")
    private String brokerURL;
    
    @Value("${spring.activemq.user-name:}")
    private String userName;
    
    @Value("${spring.activemq.password:}")
    private String password;
    
    @Bean(name = ActiveMQConstants.QUEUE_1)
    public Queue queue1() {
        return new ActiveMQQueue(ActiveMQConstants.QUEUE_1);
    }
    
    @Bean(name = ActiveMQConstants.QUEUE_2)
    public Queue queue2() {
        return new ActiveMQQueue(ActiveMQConstants.QUEUE_2);
    }
    
    @Bean(name = ActiveMQConstants.QUEUE_3)
    public Queue queue3() {
        return new ActiveMQQueue(ActiveMQConstants.QUEUE_3);
    }
    
    @Bean(name = ActiveMQConstants.TOPIC_1)
    public Topic topic1() {
        return new ActiveMQTopic(ActiveMQConstants.TOPIC_1);
    }
    
    @Bean(name = ActiveMQConstants.TOPIC_2)
    public Topic topic2() {
        return new ActiveMQTopic(ActiveMQConstants.TOPIC_2);
    }
    
    @Bean(name = ActiveMQConstants.TOPIC_3)
    public Topic topic3() {
        return new ActiveMQTopic(ActiveMQConstants.TOPIC_3);
    }
    
    @Bean
    public ConnectionFactory connectionFactory() {
        return new ActiveMQConnectionFactory(userName, password, brokerURL);
    }
    
    @Bean(name = ActiveMQConstants.QUEUE_LISTENER)
    public JmsListenerContainerFactory<?> queueJmsListenerContainerFactory(ConnectionFactory connectionFactory){
        SimpleJmsListenerContainerFactory factory = new SimpleJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setPubSubDomain(false);
        return factory;
    }
    
    @Bean(name = ActiveMQConstants.TOPIC_LISTENER)
    public JmsListenerContainerFactory<?> topicJmsListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleJmsListenerContainerFactory factory = new SimpleJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setPubSubDomain(true);
        return factory;
    }

}
