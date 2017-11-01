/**
  * Created by schandragupt on 12/13/2016 AD.
  */

trait base{
  val x: String
}

abstract class t1 extends base{
 override  val x= "x1"
}

trait t2 extends base{
  override val x = "x2"
}

trait t3 extends base{
  override val x = "x3"
}

case class cct1t2() extends t1 with t2 with t3{
  def printx():Unit = println(x)
}

object DiamondDependency extends App{

  new cct1t2().printx()

}
