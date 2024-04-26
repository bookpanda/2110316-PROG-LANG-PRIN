object FactorialTail {

//  def factorial(x: Int): Int = {
//    factorial(x, 1)
//  }
  def factorial(x: Int, acc: Int = 1): Int = {
    if(x == 0) acc
    else factorial(x-1, x*acc)
  }

  def main(args: Array[String]): Unit = {
    println(factorial(5))
  }
}