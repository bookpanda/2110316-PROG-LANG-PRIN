package HW01

object Question02 {
  def insertInOrder(x: Int, l:List[Int]): List[Int] ={
    if(l.isEmpty) return List(x)
    if(l.head >= x) return x :: l
    l.head :: insertInOrder(x, l.tail)
  }
  def main(args: Array[String]) = {
    val l: List[Int] = List(1,2,2,3,4,5,7)
    println(insertInOrder(0,l))
    println(insertInOrder(1,l))
    println(insertInOrder(2,l))
    println(insertInOrder(3,l))
    println(insertInOrder(4,l))
    println(insertInOrder(5,l))
    println(insertInOrder(6,l))
    println(insertInOrder(7,l))
    println(insertInOrder(8,l))
  }

}
