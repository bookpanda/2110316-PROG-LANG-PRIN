package review

import HW01.Question04.palindrome

object Question04 {
  def index(x: Int, l: List[Any]): Any = {
    if(l.isEmpty) return None
    if(x == 0) return l.head
    index(x-1, l.tail)
  }

  def checkPal(x: Int, y: Int, l: List[Any]): Boolean = {
    if(x > y) return true
    index(x, l) == index(y, l) && checkPal(x+1, y-1, l)
  }

  def palindrome(l :List[Any]): Boolean = {
    checkPal(0, l.length-1, l)
  }

  def main(args: Array[String]) = {
    println(palindrome(List()))
    println(palindrome(List(1)))
    println(palindrome(List(1,2,1)))
    println(palindrome(List(1,2,3,2,1)))
    println(palindrome(List(1,1)))
    println(palindrome(List(1,1,1,1,1)))
    println(palindrome(List(1,1,1,1,1,1)))
    println(palindrome(List(1,2,3,2)))
  }
}
