package HW01

object Question06 {
  
  def myFilter(f:Int => Boolean) (list:List[Int]): List[Int] = {
    if(list.isEmpty) return List()
    if(f(list.head)) return list.head :: myFilter(f)(list.tail)
    myFilter(f)(list.tail)
  }
  def isEven(x: Int): Boolean = {
    return x % 2 == 0
  }
  def main(args: Array[String]) = {
    println(myFilter(isEven)(List(1,2,3,4,5)))
    println(myFilter(isEven)(List(1,5)))
    println(myFilter(isEven)(List()))
    println(myFilter(isEven)(List(2,2,2,4,4,3)))
  }
}
