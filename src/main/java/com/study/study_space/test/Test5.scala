package test

import java.text.SimpleDateFormat

object Test5 {


  def main(args: Array[String]): Unit = {

//    println(first_data("2019-04-22,2019-04-23"))

    println(format_date1("2019-04-22"))
  }

  val first_data  = (str_arr: String) => {
    try{
      var format=new SimpleDateFormat("yyyyMMdd")
      var format1=new SimpleDateFormat("yyyy-MM-dd")
      var arr: Array[String] = str_arr.split(",")
      println(arr.min)
      format.format(format1.parse(arr.min))
    }catch {
      case e: Exception=> {
        "0"
      }
    }
  }

  val format_date1  = (str: String) => {
    try {
      var format = new SimpleDateFormat("yyyy-MM-dd")
      var date = format.parse(str)
      val str_new = new SimpleDateFormat("yyyyMMdd").format(date)
      str_new
    } catch {
      case e: Exception => {
        "0"
      }
    }
  }

}
