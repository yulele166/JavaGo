/**
 * 
 */
package com.zexi.java.activemq.spring;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

/**
 * @author yulele
 *
 * @time 2017年6月9日 下午4:47:47
 */
public class Receiver {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:spring-activemq.xml");  
        JmsTemplate jmsTemplate = (JmsTemplate) ctx.getBean("jmsTemplate");  
        while(true) {  
            Map<String, Object> map =  (Map<String, Object>) jmsTemplate.receiveAndConvert();  
            System.out.println("收到消息：" + map.get("message"));  
        }  
    }
}
