
object InferTest extends App {

  println(printWithoutReturnInfer)

  println(printWithReturnInfer)

  def printWithoutReturnInfer { "pinting without return.." }

  def printWithReturnInfer = { "printing with return.." }
}