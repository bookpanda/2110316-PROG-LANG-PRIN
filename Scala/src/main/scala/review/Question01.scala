package review

import HW01.Question01.insertAtPosition

object Question01 {
  def insertAtPosition(x: Any, pos: Int, l:List[Any]): List[Any] ={
    if(l.isEmpty) return List(x)
    if(pos == 0) return x :: l
    l.head :: insertAtPosition(x, pos-1, l.tail)
  }

  def main(args: Array[String]) = {
    val l: List[Any] = List(1,2,3,4,5)
    println(insertAtPosition("a", 0, l))
    println(insertAtPosition("a", 1, l))
    println(insertAtPosition("a", 2, l))
    println(insertAtPosition("a", 3, l))
    println(insertAtPosition("a", 4, l))
    println(insertAtPosition("a", 5, l))
  }

}
