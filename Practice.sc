

val even:Int=>Boolean = {
  println("val1")
  x=> x % 2 == 0
}

even(3)

even(4)

val even2 =(x: Int)=>{
  println("val")
  x % 2 == 0
}

even2(3)

even2(4)


val even3 : Int => Boolean = { println("in even2"); x => x % 2 == 0 }

