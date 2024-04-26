package HW01

object Question03 {
  def isInList(x: Any, l: List[Any]): Boolean = {
    if(l.isEmpty) false
    else if(x == l.head) true
    else isInList(x, l.tail)
  }
  def subList(l1: List[Any], l2:List[Any]): Boolean = {
    if(l1.isEmpty) return true
    isInList(l1.head, l2) && subList(l1.tail, l2)
  }
  def main(args: Array[String]) = {
    println(subList(List(), List())) //true
    println(subList(List(), List(1))) //true
    println(subList(List(1), List())) //false
    println(subList(List(1), List(1,2,3))) //true
    println(subList(List(1,5), List(1,1,2,3))) //false
    println(subList(List(1,2,3), List(1,2,3,4,5))) //true
    println(subList(List(6,5,5,4,3,3,2,1), List(1,2,3,3,4,5,5,6))) //true
  }

}
