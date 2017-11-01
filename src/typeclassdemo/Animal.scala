package typeclassdemo

/**
  * Created by schandragupt on 11/13/2016 AD.
  */
// an existing, closed model
trait Animal
final case class Dog(name: String) extends Animal
final case class Cat(name: String) extends Animal
