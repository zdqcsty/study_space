package com.study.study_space.jichu.io.jaxb;

import com.study.study_space.jichu.io.Resource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;

public class JAXB_Demo {

    public static void main(String[] args) {

//        objectToXml();
        xmlToObject();
    }

    public static void objectToXml(){
        try {
            JAXBContext jContext = JAXBContext.newInstance(Student.class);
            Marshaller marshallObj = jContext.createMarshaller();
            marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            Student student = new Student("abc", 123, "hadoop");
            marshallObj.marshal(student, new FileOutputStream("D:\\student.xml"));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void xmlToObject(){
        try {
            JAXBContext jContext = JAXBContext.newInstance(Student.class);
            Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
            Student student = (Student) unmarshallerObj.unmarshal(JAXB_Demo.class.getClassLoader().getResourceAsStream("config/student.xml"));
            System.out.println(student.getName()+":"+student.getId()+":"+student.getSubject());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


}
