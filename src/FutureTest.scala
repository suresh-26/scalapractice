import scala.concurrent.Future

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.{Failure, Success}
/**
  * Created by schandragupt on 11/4/2016 AD.
  */
object FutureTest extends App{

  practiceFuture

  def practiceFuture: Unit= {
    val numF = Future {3}

    val stringF = numF.map(n => Future(n.toString))

    val flatStringF = numF.flatMap(n => Future(n.toString))


    println("before response")

    numF.onSuccess {
      case str => println("print response: " + str)
      case _ => println("success other")
    }

    numF.onFailure {
      case t => println("error: " + t)
      case _ => println("fail other")
    }



    //val value2 = Await.result(flatStringF, 10 seconds)

    //println("vl; " + value2)


    val firstOccurrence: Future[Int] = Future {
      val source = scala.io.Source.fromFile("build.sbt")
      source.toSeq.indexOfSlice("com")
    }

    println("before printing error")

    firstOccurrence.onComplete{
      case Success(word) => println("word"+word)
      case Failure(t) => println("error "+t.getMessage)
    }

    firstOccurrence onSuccess {
      case idx => println("The keyword first appears at position: " + idx)
    }
    firstOccurrence onFailure {
      case t => println("Could not process file: " + t.getMessage)
    }

   // val value = Await.result(firstOccurrence, 10 seconds)

   // println("vl; " + value)

    sys.addShutdownHook(() => {
      firstOccurrence.isCompleted
    })
  }
}
