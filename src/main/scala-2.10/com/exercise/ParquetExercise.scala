package com.exercise

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

/**
  * Created by shong on 17.02.2017.
  */
object ParquetExercise {
  def main(args : Array[String]) = {
    val conf = new SparkConf().setAppName("ParquetExercise")
    val sc = new SparkContext(conf)
    val sqlContext = new org.apache.spark.sql.SQLContext(sc)
    //val parqfile = sqlContext.read.parquet("nzztest.parquet")//if parquet file locate in same path as jar (e.g. hdfs:///user/spark/)
    val parqfile = sqlContext.read.parquet("hdfs:///user/shong/nzztest.parquet")
    parqfile.show(10)
  }

}
