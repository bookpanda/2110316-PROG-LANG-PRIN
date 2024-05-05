package review

import HW01.Question10.alternate

object Question10 {
  def alternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list: List[Int], turn: Int): Int = {
    if(list.isEmpty) return 0
    if(list.length < 2) return list.head
    if(turn % 2 == 0) return alternate(f1, f2, f1(list.head, list.tail.head) :: list.tail.tail, turn+1)
    alternate(f1, f2, f2(list.head, list.tail.head) :: list.tail.tail, turn+1)
  }
  def alternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list: List[Int]): Int = {
    alternate(f1, f2, list, 0)
  }
  def add(x: Int, y: Int): Int = {
    x+y
  }
  def minus(x: Int, y: Int): Int = {
    x-y
  }
  def main(args: Array[String]) = {
    println(alternate(add, minus, List()))
    println(alternate(add, minus, List(55)))
    println(alternate(add, minus, List(1,2)))
    println(alternate(add, minus, List(1,2,3)))
    println(alternate(add, minus, List(1,2,3,4)))
  }
}
