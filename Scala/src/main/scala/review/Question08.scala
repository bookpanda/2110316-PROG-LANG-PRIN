package review

import HW01.Question08.{index, maxAll}

object Question08 {
  def index(l: List[Int], x: Int): Int = {
    if(l.isEmpty) return 0
    if(x == 0) return l.head
    index(l.tail, x-1)
  }
  def getMaxFromAll(lists: List[List[Int]], x: Int, max: Int): Int = {
    if(lists.isEmpty) return max
    val a = index(lists.head, x)
    if(a > max) return getMaxFromAll(lists.tail, x, a)
    getMaxFromAll(lists.tail, x, max)
  }
  def maxAll(lists: List[List[Int]], x: Int): List[Int] = {
    if(lists.isEmpty) return List()
    if(x > lists.head.length - 1) return maxAll(lists.tail, x)
    getMaxFromAll(lists, x, index(lists.head, x)) :: maxAll(lists, x+1)
  }
  def maxAll(lists:List[List[Int]]): List[Int] = {
    maxAll(lists, 0)
  }
  def main(args: Array[String]) = {
    println(index(List(1,2,3,4,5), 1))
    println(maxAll(List()))
    println(maxAll(List(List())))
    println(maxAll(List(List(1,2,3,4,8,9),List(),List(4,5),List(1,2,3,5,6,10,11))))
    println(maxAll(List(List(3,4),List(1,2,3,4,51,61),List(1,2,31,41,61,51))))
    println(maxAll(List(List(1,2,3,40,5,6),List(10,2,30,4),List(1,200),List(0,0,0,0,0,0,0,0,9))))
  }
}
