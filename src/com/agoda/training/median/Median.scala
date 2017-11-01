package com.agoda.training.median

class Median[T](sequence: Seq[T]) {

  //change this to pass implicit ordering explicity 
  def median(f: (T, T) => Boolean) = { sequence.sortWith(f).drop(sequence.length / 2).head }

}