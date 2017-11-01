
object TypeCasting {

  /*
   *one can not assign different type of value to a variable of diff type. 
   * example: we can change string from value to new but not to a number (1) 
   */
  def stringToIntCasting() = {
    var string = "value"
    println(string)
    string = "new"
    //This will throw error 
    //string =1
    string = "1"
  }
}