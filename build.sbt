name := "spark-ai-apps"
version := "1.0"
scalaVersion := "2.11.8"

val sparkVersion = "2.1.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.jfree" % "jfreechart" % "1.0.14",
  "com.github.wookietreiber" % "scala-chart_2.11" % "0.5.0",
  "org.apache.spark" %% "spark-streaming" % sparkVersion
)

libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.1.0"
        