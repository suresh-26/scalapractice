package typeclassdemo

/**
  * Created by schandragupt on 11/13/2016 AD.
  */
object TypeClassDemo extends App {
  import Humanish.HumanLike

  // create a method to make an animal speak
//  def makeHumanLikeThingSpeak[A](animal: A)(implicit humanLike: HumanLike[A]) {
//    humanLike.speak(animal)
//  }

  implicit val abc = HumanLike

  val dog = Dog("Rover")

  abc.DogIsHumanLike.speak(dog)

  val cat = Cat("Morris")

  //abc.DogIsHumanLike.speak(cat)

  // because HumanLike implemented this for a Dog, it will work
  //makeHumanLikeThingSpeak(Dog("Rover"))

  // however, the method won't compile for a Cat (as desired)
  //makeHumanLikeThingSpeak(Cat("Morris"))
}
