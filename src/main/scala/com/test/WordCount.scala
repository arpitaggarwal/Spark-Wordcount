package com.test

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import scala.tools.nsc.transform.Flatten
import org.apache.spark.rdd.RDD

object WordCount extends App {
  val conf = new SparkConf().setAppName("HelloWorld").setMaster("local")
  val context: SparkContext = new SparkContext(conf)
  val textFile : RDD[String] = context.textFile("src/main/resources/data.txt", 1)
  val tokenized = textFile.flatMap(_.split(" "))
  val wordCounts = tokenized.map((_, 1))
  val count = wordCounts.reduceByKey(_ + _)
  println(count.collect.mkString(", "));
  context.stop
}