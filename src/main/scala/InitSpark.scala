/**
  * Created by oleg.baydakov on 15/06/2017.
  * https://github.com/faizanahemad/spark-gradle-template/blob/master/src/main/scala/template/spark/InitSpark.scala
  */
import org.apache.log4j.{Level, LogManager, Logger}
import org.apache.spark.sql.SparkSession

trait InitSpark {
  val spark: SparkSession = SparkSession.builder()
    .appName("Spark example")
    .master("local[*]")
    .config("option", "some-value")
    .getOrCreate()

  val sc = spark.sparkContext
  val sqlContext = spark.sqlContext

  def reader = spark.read
    .option("header",true)
    .option("inferSchema", true)
    .option("mode", "DROPMALFORMED")
    .option("dateFormat", "MM/dd/yyyy")

  def readerWithoutHeader = spark.read
    .option("header",true)
    .option("inferSchema", true)
    .option("mode", "DROPMALFORMED")
    .option("dateFormat", "MM/dd/yyyy")

  private def init = {
    sc.setLogLevel("ERROR")
    Logger.getLogger("org").setLevel(Level.ERROR)
    Logger.getLogger("akka").setLevel(Level.ERROR)
    LogManager.getRootLogger.setLevel(Level.ERROR)
  }

  init

  def close = {
    spark.close()
  }
}
