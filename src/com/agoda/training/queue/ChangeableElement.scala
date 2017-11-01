package com.agoda.training.queue

trait ChangeableElement extends Queue {
  abstract override def put(element: String): Queue = {
    super.put(element.reverse)
  }
}