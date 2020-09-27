package com.study.study_space.jichu.data.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.List;

/**
 * JAXB 是java自带的解析xml的工具
 * 参考样例
 * http://blog.leanote.com/post/2005km@163.com/java%E4%BD%BF%E7%94%A8jaxb%E8%A7%A3%E6%9E%90xml
 *
 */

public class JaxbReadXml {

    @SuppressWarnings("unchecked")
    public static <T> T readString(Class<T> clazz, String context) throws JAXBException, IOException {
        try {
            InputStream inputStream = ClassLoader.getSystemResource(context).openStream();
            JAXBContext jc = JAXBContext.newInstance(clazz);
            Unmarshaller u = jc.createUnmarshaller();
            return (T) u.unmarshal(inputStream);
        } catch (JAXBException e) {
            throw e;
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T readConfig(Class<T> clazz, String config, Object... arguments) throws IOException,
            JAXBException {
        InputStream is = null;
        try {
            if (arguments.length > 0) {
                config = MessageFormat.format(config, arguments);
            }
            // logger.trace("read configFileName=" + config);
            JAXBContext jc = JAXBContext.newInstance(clazz);
            Unmarshaller u = jc.createUnmarshaller();
            is = new FileInputStream(config);
            return (T) u.unmarshal(is);
        } catch (IOException e) {
            // logger.trace(config, e);
            throw e;
        } catch (JAXBException e) {
            // logger.trace(config, e);
            throw e;
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T readConfigFromStream(Class<T> clazz, InputStream dataStream) throws JAXBException {
        try {
            JAXBContext jc = JAXBContext.newInstance(clazz);
            Unmarshaller u = jc.createUnmarshaller();
            return (T) u.unmarshal(dataStream);
        } catch (JAXBException e) {
            // logger.trace(e);
            throw e;
        }
    }

    public static void main(String[] args) throws JAXBException, IOException {

        InputStream inputStream = ClassLoader.getSystemResource("./datafile/clustersinfo.xml").openStream();
        JAXBContext jc = JAXBContext.newInstance(ClusterInfoList.class);
        Unmarshaller u = jc.createUnmarshaller();
        ClusterInfoList list = (ClusterInfoList) u.unmarshal(inputStream);

        List<ClusterInfo> clusterinfos = list.getClusterinfos();
        for (ClusterInfo info : clusterinfos) {
            XmlHdfsInfo hdfsInfo = info.getHdfsInfo();
            System.out.println(info.getName());
            System.out.println(hdfsInfo.getKeytabPath());
        }

    }

}
