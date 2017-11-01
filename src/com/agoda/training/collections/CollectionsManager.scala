package com.agoda.training.collections
import scala.collection.mutable._

object CollectionsManager {

  def main(args: Array[String]): Unit = {
    println(getUpdatedList(ListBuffer(1, 2, 3, 4, 5), Map((1, 3), (2, 4), (3, 5))))
  }

  def getUpdatedList(numList: ListBuffer[Int], numMap: Map[Int, Int]): ListBuffer[Int] = {
    var trackNotFound = new ArrayBuffer[Int]
    var itemsRemovedCount = 0
    for (i <- numList.indices) {
      val num = numList(i)
      val optionNum = numMap.get(num)
      if (optionNum.isDefined) numList.update(i, optionNum.get * num)
      else trackNotFound += i
    }
    for (indexToDrop <- trackNotFound) {
      numList.remove(indexToDrop - itemsRemovedCount)
      itemsRemovedCount += 1
    }
    numList
  }
}