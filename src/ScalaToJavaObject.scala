
import scala.collection.JavaConversions._
object ScalaToJavaObject {

  def main(args: Array[String]): Unit = {
    val scalaList = List(1, 2, 3)
    val javaList1 = toJavaListWithOneElement(scalaList)
    println(javaList1)
    val javaList2 = toJavaListWithAllElements(scalaList)
    println(javaList2)
  }

  /**
   * this will create a list with an element of another list
   */
  def toJavaListWithOneElement(scalaList: List[Int]) = {
    java.util.Arrays.asList(scalaList.toArray)
  }

  /**
   * this will create a java list while copying all the elements of existing list..because of _
   */
  def toJavaListWithAllElements(scalaList: List[Int]) = {
    java.util.Arrays.asList(scalaList.toArray: _*)
  }
}