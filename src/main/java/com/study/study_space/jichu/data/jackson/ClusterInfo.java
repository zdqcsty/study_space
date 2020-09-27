package com.study.study_space.jichu.data.jackson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ClusterInfo {
    private String name;
    @JacksonXmlProperty(localName = "hdfsinfo")
    private XmlHdfsInfo hdfsInfo;

    public ClusterInfo() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public XmlHdfsInfo getHdfsInfo() {
        return hdfsInfo;
    }

    public void setHdfsInfo(XmlHdfsInfo hdfsInfo) {
        this.hdfsInfo = hdfsInfo;
    }

}
