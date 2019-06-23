package message.jms;

import org.apache.activemq.broker.BrokerService;

public class Broke {

    public static void main(String[] args) throws Exception {

        /**
         * Broker是ActiveMQ的一个实例。Broker是ActiveMQ的一个简易实现,用跑代码的方式启动ActiveMQ，从而实现嵌入式的ACtiveMQ
         */

        String url =  "tcp://0.0.0.0:61616";
        BrokerService broker = new BrokerService();
        broker.setBrokerName("Nokia Message Service");
        broker.setDataDirectory("./work/activemq");
        broker.addConnector(url);
        broker.start();

    }
}
