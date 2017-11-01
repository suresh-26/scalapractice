
object PatternMatch {

  def main(args: Array[String]): Unit = {
    ordinal(5)
    patternMatchAnything("str")
    patternMatchAnything(List("a", "b", "c"))
    patternMatchAnything(Array("a", "b"))
    patternMatchAnything(new java.util.Date)
    println(extractListWithFirstTwoValues(List(1, 2, 3, 4)))
    println(extractListWithFirstTwoValues(List(1, 2, 3)))
    println(extractListWithFirstTwoValues(List(1, 2)))
    println(extractListWithFirstTwoValues(List(1)))
    rangeMatcher(10)
    rangeMatcher(117)
  }

  def ordinal(number: Int) = number match {
    case 1 => println("1st")
    case 2 => println("2nd")
    case 3 => println("3rd")
    case _ => println("5th")
  }

  def patternMatchAnything(obj: AnyRef) = obj match {
    case s: String => println("This is string")
    case l: List[_] => println("This is List")
    case a: Array[_] => println("This is an array")
    case d: java.util.Date => println("This is a date")
  }

  def extractListWithFirstTwoValues(inputList: List[Int]) = inputList match {
    case f :: s :: rest => List(f, s)
    case _ => Nil
  }

  def rangeMatcher(num: Int) = num match {
    case within10 if within10 <= 10 => println("with in 0 to 10")
    case within100 if within100 <= 100 => println("with in 11 to 100")
    case beyond100 if beyond100 < Integer.MAX_VALUE => println("beyond 100")
  }
}