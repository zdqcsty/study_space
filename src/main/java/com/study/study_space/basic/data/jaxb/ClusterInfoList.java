package com.study.study_space.basic.data.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.List;

@XmlRootElement(name = "clusterinfos")
public class ClusterInfoList {

    @XmlElement(name = "clusterinfo")
    public List<ClusterInfo> clusterinfos;

    @XmlTransient
    public List<ClusterInfo> getClusterinfos() {
        return clusterinfos;
    }

    public void setClusterinfos(List<ClusterInfo> clusterinfos) {
        this.clusterinfos = clusterinfos;
    }

}

