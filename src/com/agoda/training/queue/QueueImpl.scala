package com.agoda.training.queue
import scala.collection.mutable.ArrayBuffer
//TODO : try to make it immutable data structure
class QueueImpl(total: Int = 10) extends Queue {
  val queueAsArr = new ArrayBuffer[String](total)

  def put(element: String): Queue = {
    if (queueAsArr.length == total) throw new NoSuchElementException("Overflow")
    queueAsArr += element
    this
  }

  def get(): String = {
    if (queueAsArr.headOption.isEmpty) throw new NoSuchElementException("Underflow")
    queueAsArr.remove(0)
  }
}