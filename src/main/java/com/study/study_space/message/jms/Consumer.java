package com.study.study_space.message.jms;

import javax.jms.*;

public class Consumer {

    public static void main(String[] args) throws JMSException {

        Connection connection = Producer.getConnection();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        final Queue destination = session.createQueue("test_queue");
        session.createConsumer(destination).setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                System.out.println("=============");
            }
        });
    }
}
