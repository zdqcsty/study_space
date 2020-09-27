package com.study.study_space.jichu.data.jaxb;

import javax.xml.bind.annotation.*;


public class XmlHdfsInfo {

    @XmlElement(name = "hdfsconfpath")
    private String hdfsConfPath;
    @XmlElement(name = "hdfsuri")
    private String hdfsUri;
    @XmlElement(name = "user")
    private String user;
    @XmlElement(name = "krb5confpath")
    private String krb5ConfPath;
    @XmlElement(name = "userkerberos")
    private String userKerberos;
    @XmlElement(name = "keytabpath")
    private String keytabPath;

    public XmlHdfsInfo() {
    }


    // @XmlTransient这个注解用来防止出现属性冲突的（具体报错为---类具有两个相同的属性名称）   它和@XmlElement结合起来使用
    @XmlTransient
    public String getHdfsConfPath() {
        return hdfsConfPath;
    }

    public void setHdfsConfPath(String hdfsConfPath) {
        this.hdfsConfPath = hdfsConfPath;
    }

    @XmlTransient
    public String getHdfsUri() {
        return hdfsUri;
    }

    public void setHdfsUri(String hdfsUri) {
        this.hdfsUri = hdfsUri;
    }

    @XmlTransient
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @XmlTransient
    public String getKrb5ConfPath() {
        return krb5ConfPath;
    }

    public void setKrb5ConfPath(String krb5ConfPath) {
        this.krb5ConfPath = krb5ConfPath;
    }

    @XmlTransient
    public String getUserKerberos() {
        return userKerberos;
    }

    public void setUserKerberos(String userKerberos) {
        this.userKerberos = userKerberos;
    }

    @XmlTransient
    public String getKeytabPath() {
        return keytabPath;
    }

    public void setKeytabPath(String keytabPath) {
        this.keytabPath = keytabPath;
    }

}
