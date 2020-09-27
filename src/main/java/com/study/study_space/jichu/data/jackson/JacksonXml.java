package com.study.study_space.jichu.data.jackson;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JacksonXml {

    public static final String XML_PATH="./datafile/clustersinfo.xml";

    public static void main(String[] args) throws IOException {

        InputStream is = ClassLoader.getSystemResource(XML_PATH).openStream();
        XmlMapper xmlMapper = new XmlMapper();
        ClusterInfoList clusters = xmlMapper.readValue(is, ClusterInfoList.class);
        List<ClusterInfo> clusterinfos = clusters.getClusterinfos();

        for (ClusterInfo info : clusterinfos) {
            XmlHdfsInfo hdfsInfo = info.getHdfsInfo();
            System.out.println(hdfsInfo.getHdfsUri());
        }
    }

}
