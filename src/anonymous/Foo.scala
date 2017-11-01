package anonymous

case class Foo[A, B](f: A => B) {

  var s: String = _

  println(f)
  //def print1 { println("1") }
}