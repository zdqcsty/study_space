package com.study.study_space.message.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.io.*;
import java.util.Properties;

public class Producer {


    public static void main(String[] args) throws IOException {

     /*   Properties props = new Properties();
        props.put("bootstrap.servers", "10.6.2.107:9092");
        props.put("acks", "all");
        //props.put("delivery.timeout.ms", 30000);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer = new KafkaProducer<>(props);
        for (int i = 0; i < 100; i++)
            producer.send(new ProducerRecord<String, String>("test", Integer.toString(i), Integer.toString(i)));

        producer.close();*/


        Properties props = new Properties();
        props.put("bootstrap.servers", "192.168.6.1:9092");
        props.put("acks", "0");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        //生产者发送消息
        String topic = "test";
        org.apache.kafka.clients.producer.Producer<String, String> procuder = new KafkaProducer<String, String>(props);
        String newPathName="";

        String pathname = "/home/guanghao/test/demo/str.txt";
        File filename = new File(pathname);
        InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
        BufferedReader br = new BufferedReader(reader);
        String line = "";

        while (line != null) {
            line = br.readLine();
            procuder.send(new ProducerRecord<String, String>(topic, line));
        }
        procuder.close();

//        for (int i=0;i<50;i++){
//            newPathName=pathname+"s1mme_"+String.format("%03d", i);
//            File filename = new File(newPathName);
//            try {
//                InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
//                BufferedReader br = new BufferedReader(reader);
//                String line = "";
//                while (line != null) {
//                    line = br.readLine();
//                    procuder.send(new ProducerRecord<String, String>(topic, line));
//                }
//                System.out.println("succeed"+i);
//                Thread.sleep(1000);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }



//        Random randomKey=new Random(50);
//        Random randomValue=new Random(60);
//
//        int a=0;
//        String key="key";
//        String value="value";
//        for (int i=0;i<3000;i++){
//        ProducerRecord<String, String> msg = new ProducerRecord<String, String>(topic, key+i,value+i);
//        procuder.send(msg);
//        }
//        a++;
//        System.out.println("charuwangcheng"+a);
//        procuder.close();
    }




}
