/**
  * Created by oleg.baydakov on 08/05/2017.
  * https://github.com/ippromek/spark-ml/blob/branch-ed2/Chapter_12/2.0.0/spark-ai-apps/src/main/scala/org/utils/StandaloneSpark.scala
  */
package org.utils

import org.apache.spark.sql.{SQLContext, SparkSession}

/**
  * Created by manpreet.singh on 14/12/16.
  */
object StandaloneSpark {

  private val spark = SparkSession
    .builder
    .appName("AIApps")
    .master("local[1]")
    .getOrCreate()


  // get spark instance
  def getSparkInstance(): SparkSession = {
    return spark
  }

  // get sql context
  def getSQLContext(): SQLContext = {
    // get sql context here
    val sqlContext = spark.sqlContext
    return sqlContext
  }
}
