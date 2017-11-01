package com.agoda.training.string

object StringManager {
  def main(args: Array[String]): Unit = {
    val str = "This is a string with many words"
    val words = getWordsFromString(str)
    getLongestWord(words)
    words.toArray
  }

  def getWordsFromString(sentence: String): Array[String] = {
    sentence.split("\\s+")
  }

  def getLongestWord(wordArr: Array[String]) {
    wordArr.maxBy(_.length)
  }

  def getCommonWord(wordArr: Array[String]) {
    wordArr.groupBy(identity).mapValues(_.size)
  }

  def getCommonChar(wordArr: Array[Char]) {
    //   wordArr.groupBy(_.toChar.).mapValues(_.size)
  }

  def getLetterToWordMap(wordArr: Array[String]) {
    wordArr.groupBy(word => word.chars()).mapValues(_.size)
  }
}