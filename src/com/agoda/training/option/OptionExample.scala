package com.agoda.training.option

object OptionExample {
  def getFirstSomeOption(x: Option[String], y: Option[String], z: Option[String]): String = {
    x.getOrElse(y.getOrElse(z.getOrElse("could not find")))
  }
  def main(args: Array[String]): Unit = {
    val x = Some("x")
    val y = None
    val z = None
    println(getFirstSomeOption(x, y, z))
    val x1 = None
    val y1 = Some("y")
    val z1 = None
    println(getFirstSomeOption(x1, y1, z1))
    val x2 = None
    val y2 = None
    val z2 = Some("z")
    println(getFirstSomeOption(x2, y2, z2))
    val x3 = Some("x")
    val y3 = Some("y")
    val z3 = None
    println(getFirstSomeOption(x3, y3, z3))
  }
}