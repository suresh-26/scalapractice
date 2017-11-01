package com.agoda.training.vector
import scala.collection.immutable.Vector._
object VectorTest {
  def main(args: Array[String]): Unit = {
    val vector = new VectorOperator(Vector(1, 2, 3))
    println(vector.x)
    println(vector.y)
    println(vector.z)
  }
}