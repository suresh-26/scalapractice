package com.agoda.training.executiontime

object TimeCalculator {

  def main(args: Array[String]): Unit = {
    println("result : " + timeIt { List.range(1, 1000, 1) })
  }

  def timeIt[Result](block: => Result): Result = {
    val t0 = System.nanoTime()
    val result = block
    val t1 = System.nanoTime()
    println("Total time for execution: " + (t1 - t0))
    result
  }
}