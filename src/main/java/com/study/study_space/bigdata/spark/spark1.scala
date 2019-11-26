//package com.study.study_space.bigdata.spark
//
//import org.apache.spark.SparkConf
//import org.apache.spark.sql.SparkSession
//
//object spark1 {
//
//  def main(args: Array[String]): Unit = {
//
//    var conf=new SparkConf()
//
//    val spark = SparkSession
//      .builder()
//      .config(conf)
//      .appName("Spark SQL")
//      .getOrCreate()
//
//    val df =spark
//      .read
//      .option("sep","|")
//      .csv("file:///home/software/data/gb_commdataser_iot/*")
//
//    import spark.implicits._
//
//    df.select($"_c2".as("imsi"),$"_c54".as("msisdn"),$"_c18".as("apn"))
//      .createOrReplaceTempView("s1u2g")
//
//    val df1 =spark
//      .read
//      .option("header",true)
//      .csv("file:///home/software/data/apn_group.csv").createOrReplaceTempView("apn_group")
//
//    spark.sql("select imsi,a.* from s1u2g " +
//      "inner join apn_group a on s1u2g.apn=a.c_custom_apn")
//      .write
//      .format("csv")
//      .save("file:///home/software/test/s1u2g.csv")
//
//  }
//
//}
