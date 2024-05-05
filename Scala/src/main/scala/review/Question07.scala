package review

import HW01.Question07.myMap

object Question07 {
  
  def myMap(f:Int => Int) (list:List[Int]) :List[Int] = {
    if(list.isEmpty) return List()
    f(list.head) :: myMap(f)(list.tail)
  }

  def main(args: Array[String]) = {
    println(myMap(x => x*2)(List(1,2,3,4)))
  }
}
