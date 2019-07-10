package com.study.study_space.message.jms;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTextMessage;

import javax.jms.*;

public class Producer {

    public static void main(String[] args) throws JMSException, InterruptedException {

        //第一个参数是否开启事务 true开启 ,false不开启事务，如果开启记得手动提交
        //参数二，表示的是签收模式，一般使用的有自动签收和客户端自己确认签收
        Session session = getConnection().createSession(false, Session.AUTO_ACKNOWLEDGE);

        Queue queue  = session.createQueue("test_queue");
        //为队列创建消息生产者
        MessageProducer producer =  session.createProducer(queue);

        //TextMessage message = session.createTextMessage("aaaaaaaaa");
        ActiveMQTextMessage message=new ActiveMQTextMessage();

        for(int i=0;i<10;i++) {
            message.setText("hahahahha");
            System.out.println("------------------------------------"+i);
            producer.send(message);
            Thread.sleep(5000);
        }
    }

    public static Connection getConnection() throws JMSException {
        ActiveMQConnectionFactory connectionFactory = null;
        //链接对象
        Connection connection = null;
        connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,ActiveMQConnection.DEFAULT_PASSWORD,"tcp://0.0.0.0:61616");
        connection = connectionFactory.createConnection();
        connection.start();
        return connection;
    };

}
