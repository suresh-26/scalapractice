package com.agoda.training.string

object StringToCharList {

  def main(args: Array[String]): Unit = {
    val strList = List("one", "two", "three")
    val CharList = strListToCharList(strList)
    println(CharList)
  }

  def strListToCharList(strList: List[String]): List[Char] = {
    strList.flatMap(_.toCharArray())
  }
}