package com.study.study_space.scala

object PrimaryConstructorDemo {

  class Person1(var firstName: String, var lastName: String) {  //这里是构造函数参数

    //辅助构造函数
    def this (firstName : String) {
      this (firstName,"")    //调用主构造函数
    }

    //这里只是方法的声明，所以在创建一个对象执行构造体的时候，并不会执行它
    def showDetails()={
      println("hello world")
    }


  }

  def main(args: Array[String]) {
    val p1 = new Person1("aaa")
//    println(p1.firstName)
    println("---------------------------------")

  }
}
