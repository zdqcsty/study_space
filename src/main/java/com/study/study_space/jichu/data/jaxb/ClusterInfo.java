package com.study.study_space.jichu.data.jaxb;

import javax.xml.bind.annotation.XmlElement;

public class ClusterInfo {

    private String name;

    @XmlElement(name = "hdfsinfo")
    private XmlHdfsInfo hdfsinfo;

    public ClusterInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public XmlHdfsInfo getHdfsInfo() {
        return hdfsinfo;
    }

    public void setHdfsInfo(XmlHdfsInfo hdfsInfo) {
        this.hdfsinfo = hdfsInfo;
    }


}
