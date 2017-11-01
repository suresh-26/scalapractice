package com.agoda.training.median

object MedianTest {
  def main(args: Array[String]): Unit = {
    val median = new Median(Seq(1, 3, 5, 4, 2, 6, 7, 8, 9, 10, 11))
    println(median.median(_ < _))
    val medianDouble = new Median(Seq(1.1, 2.2, 3.3, 4.4, 5.5))
    println(medianDouble.median(_ < _))
  }
}