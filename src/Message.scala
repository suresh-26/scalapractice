/**
  * Created by schandragupt on 11/7/2016 AD.
  */
import scala.reflect.runtime.universe.{TypeTag, typeTag}

case class Message[T: TypeTag](content: T){
  val messageType: Message.Type = typeTag[T].tpe.toString
}
object Message {

  type Type = String

  def typeFrom(msg: String): Message.Type = ???

  implicit def messageSer[T:TypeTag:JsonSer]: JsonSer[Message[T]] = ???

}

trait JsonSer[T] {
  def serialize(t: T): String
  def deserialize(json: String): T
}

