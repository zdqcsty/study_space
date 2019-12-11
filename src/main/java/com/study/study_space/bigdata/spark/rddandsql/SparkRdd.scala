package com.study.study_space.bigdata.spark.rddandsql

import org.apache.spark.sql.SparkSession

object SparkRdd {

  def main(args: Array[String]): Unit = {

    val session = SparkSession.builder.getOrCreate()

    //读取csv文件并且toDF()方法  能够将列名换了
    session.read.csv("hdfs:///liuzhijie/user/zgh/ceshi.csv").toDF("aaa","bbb").createTempView("demo")

  }

}
