package com.agoda.training.squareelements

object SquareListFromMap {
  def squareList(xs: List[Int]): List[Int] =
    xs map squared

  implicit def squared(i: Int) = i * i

  def main(args: Array[String]): Unit = {
    println(squareListFromPattern(List(1, 2, 3, 4, 5)))
  }

  def squareListFromPattern(xs: List[Int]): List[Int] = xs match {
    case List() => Nil
    case y :: ys => ys map squared
  }
}