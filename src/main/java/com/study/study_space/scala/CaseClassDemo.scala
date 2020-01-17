package com.study.study_space.scala

case class CaseClassDemo(name:String)


object Test {

  def main(args: Array[String]): Unit = {

    val demo=CaseClassDemo("zeng")
    //case class构造函数的参数是public级别的  可以直接访问
    println(demo.name)


  }

}
