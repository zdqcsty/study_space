package com.study.study_space.jichu.data.jackson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

/**
 * @JacksonXmlElementWrapper(localName = "Students")
 * @JacksonXmlProperty(localName = "Stu")
 * List<Student> student;  //学生列表
 */

@Data
@JacksonXmlRootElement(localName = "clusterinfos")
public class ClusterInfoList {
    @JacksonXmlElementWrapper(localName = "demo", useWrapping = false)
    @JacksonXmlProperty(localName = "cluster")
    public List<ClusterInfo> clusterinfos;

    public ClusterInfoList() {
    }
}
