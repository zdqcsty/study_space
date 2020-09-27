package com.study.study_space.jichu.data.jackson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "clusterinfos")
public class ClusterInfoList {

    public List<ClusterInfo> clusterinfos;

    public ClusterInfoList(){}

    public List<ClusterInfo> getClusterinfos() {
        return clusterinfos;
    }

    public void setClusterinfos(List<ClusterInfo> clusterinfos) {
        this.clusterinfos = clusterinfos;
    }
}