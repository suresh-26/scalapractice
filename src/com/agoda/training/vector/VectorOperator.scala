package com.agoda.training.vector

class VectorOperator(vector: Vector[Int]) {

  val x: Vector[Int] = vector map (x => x * x)

  val y = x.foldLeft(0)(_ + _)

  val z = scala.math.sqrt(y)
}