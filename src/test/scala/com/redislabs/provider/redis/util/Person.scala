package com.redislabs.provider.redis.util

import com.redislabs.provider.redis.util.TestUtils._
import org.apache.spark.sql.{DataFrame, SparkSession}

/**
  * @author The Viet Nguyen
  */
case class Person(name: String, age: Int, address: String, salary: Double)

object Person {

  val TableNamePrefix = "person"

  val data = Seq(
    Person("John", 30, "60 Wall Street", 150.5),
    Person("Peter", 35, "110 Wall Street", 200.3)
  )

  def df(spark: SparkSession): DataFrame = spark.createDataFrame(data)

  def generatePersonTableName(): String = generateTableName(TableNamePrefix)

}