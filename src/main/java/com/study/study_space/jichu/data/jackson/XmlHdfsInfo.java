package com.study.study_space.jichu.data.jackson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class XmlHdfsInfo {
   @JacksonXmlProperty(localName = "hdfsconfpath")
   private   String hdfsConfPath;
   @JacksonXmlProperty(localName = "hdfsuri")
   private   String hdfsUri;
   private   String user;
   @JacksonXmlProperty(localName = "krb5confpath")
   private   String krb5ConfPath;
   @JacksonXmlProperty(localName = "userkerberos")
   private   String userKerberos;
   @JacksonXmlProperty(localName = "keytabpath")
   private   String keytabPath;

   public XmlHdfsInfo(){};

   public String getHdfsConfPath() {
      return hdfsConfPath;
   }

   public void setHdfsConfPath(String hdfsConfPath) {
      this.hdfsConfPath = hdfsConfPath;
   }

   public String getHdfsUri() {
      return hdfsUri;
   }

   public void setHdfsUri(String hdfsUri) {
      this.hdfsUri = hdfsUri;
   }

   public String getUser() {
      return user;
   }

   public void setUser(String user) {
      this.user = user;
   }

   public String getKrb5ConfPath() {
      return krb5ConfPath;
   }

   public void setKrb5ConfPath(String krb5ConfPath) {
      this.krb5ConfPath = krb5ConfPath;
   }

   public String getUserKerberos() {
      return userKerberos;
   }

   public void setUserKerberos(String userKerberos) {
      this.userKerberos = userKerberos;
   }

   public String getKeytabPath() {
      return keytabPath;
   }

   public void setKeytabPath(String keytabPath) {
      this.keytabPath = keytabPath;
   }
}