package review


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
  def merge(left: List[Int], right: List[Int]): List[Int] = {
    if(left.isEmpty) return right
    if(right.isEmpty) return left
    if(left.head <= right.head) return left.head :: merge(left.tail, right)
    right.head :: merge(left, right.tail)
  }
  def mergesort(l: List[Int]):List[Int] = {
    if(l.length < 2) return l
    val mid = l.length / 2
    val left = leftHalf(l, mid)
    val right = rightHalf(l, mid)
    val sortedLeft = mergesort(left)
    val sortedRight = mergesort(right)
    merge(sortedLeft, sortedRight)
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
