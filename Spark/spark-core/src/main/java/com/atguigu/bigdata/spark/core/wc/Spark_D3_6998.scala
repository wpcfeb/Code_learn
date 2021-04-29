package com.atguigu.bigdata.spark.core.wc

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

import scala.io.Source
import org.apache.spark.sql.SparkSession

import scala.collection.mutable.ArrayBuffer
object Spark_D3_6998 {

    def main(args: Array[String]): Unit = {

        val sparConf = new SparkConf().setMaster("local").setAppName("6998_Quiz2_D3")
        val sc = new SparkContext(sparConf)
        val sparkSession = SparkSession.builder.
          master("local")
          .appName("SparkSession Example")
          .getOrCreate()
      import sparkSession.implicits._
      val lines = Source.fromFile("datas/student.txt").getLines.toArray
      print(lines.length)
      val strList = Array.empty[String]
      for (line <- lines) {
        val loginValues = line.split(" ")  // return an Array
        val (t1, t2, t3, t4) = (loginValues(0), loginValues(1), loginValues(2), loginValues(3))
        strList :+ (t1, t2, t3, t4)
      }
      // convert file to Array
      val data = Array(("pw2542", "Wang", "Pengce", "3.8"), ("tx1111", "Sun", "Tom", "3.1"), ("zw1243", "Li", "Jack", "3.6"), ("te1243", "Li", "Park", "3.9"), ("ch1676", "Hou", "Smith", "2.6"))
      val rdd = sparkSession.sparkContext.parallelize(data)
      val dfFromRDD1 = rdd.toDF("Student_Id", "Last_name", "First_name", "GPA")
      dfFromRDD1.printSchema()
      dfFromRDD1.createOrReplaceTempView("student")
      val Good_student = sparkSession.sql("SELECT Last_name, First_name FROM student WHERE GPA >3.75")
      Good_student.show()

        // TODO stop connection
        sc.stop()

    }
}
