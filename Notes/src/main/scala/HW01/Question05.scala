package HW01

object Question05 {
  def leftHalf(l: List[Int], x: Int): List[Int] = {
    if(l.isEmpty) return List()
    if(x == 0) return List()
    l.head :: leftHalf(l.tail, x-1)
  }
  def rightHalf(l: List[Int], x: Int): List[Int] = {
    if(l.isEmpty) return List()
    if(x == 0) return l
    rightHalf(l.tail, x-1)
  }
  def merge(l1: List[Int], l2: List[Int]): List[Int] = {
    if(l1.isEmpty) return l2
    if(l2.isEmpty) return l1
    if(l1.head <= l2.head) return l1.head :: merge(l1.tail, l2)
    l2.head :: merge(l1, l2.tail)
  }
  def mergesort(l: List[Int]): List[Int] ={
    if(l.isEmpty || l.length == 1) return l
    val mid = l.length / 2
    val left = leftHalf(l, mid)
    val right = rightHalf(l, mid)
    val l1 = mergesort(left)
    val l2 = mergesort(right)
    merge(l1, l2)
  }
  def main(args: Array[String]) = {
    println(merge(List(1,4,6), List(2,2,3,5)))
    println(leftHalf(List(1,2,3), 1))
    println(mergesort(List()))
    println(mergesort(List(1)))
    println(mergesort(List(1,2,3)))
    println(mergesort(List(3,2,1)))
    println(mergesort(List(1,4,2,7,8,3,5,9,6)))
    println(mergesort(List(-1,-6,2,4,9,11)))
  }
}
