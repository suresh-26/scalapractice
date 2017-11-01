package anonymous

object Annonym extends App {

  val f1 = Foo {
    println("hello from the `f1` instance")
    "this is the result of the block of code"
  }

  //f1.print1

}