object ListEx {
  def member(x:Any, l: List[Any]): Boolean = {
    if(l.isEmpty) return false
    if(x == l.head) return true
    member(x, l.tail)
  }
  def sorted(l: List[Int]):Boolean = {
    if(l.length < 2) return true
    (l.head <= l.tail.head) && sorted(l.tail)
  }
  def delete(x: Any, l: List[Any]): List[Any] = {
    if(l.isEmpty) List()
    else if(x == l.head) delete(x, l.tail)
    else l.head::delete(x, l.tail)
  }
  def length(l:List[Any]): Int = {
    if(l.isEmpty) 0
    else 1 + length(l.tail)
  }
  def append(l1: List[Any], l2: List[Any]): List[Any] = {
    if(l1.isEmpty) return l2
    if(l2.isEmpty) return l1
    val t2 = append(l1.tail, l2)
    l1.head :: t2
  }
  def myReverse(l: List[Any]): List[Any] = {
    if(l.isEmpty) return List()
    myReverse(l.tail) ++ List(l.head)
//    append(myReverse(l.tail), List(l.head))
  }
  def dot(l1:List[Int], l2:List[Int]): Int = {
    if(l1.isEmpty || l2.isEmpty) return 0
    l1.head*l2.head + dot(l1.tail, l2.tail)
  }
  def dotAcc(l1: List[Int], l2: List[Int], acc: Int): Int = {
    if(l1.isEmpty || l2.isEmpty) return acc
    else dotAcc(l1.tail, l2.tail, l1.head*l2.head + acc)
  }
  def maxx(l: List[Int], acc: Int): Int = {
    if(l.isEmpty) acc
    else if(l.head > acc) maxx(l.tail, l.head)
    else maxx(l.tail, acc)
  }
  def max(l:List[Int]): Int = {
    maxx(l, l.head)
  }

  def setify(l:List[Any]): List[Any] = {
    if(l.isEmpty) return List()
    if(member(l.head, l.tail)) return setify(l.tail)
    l.head :: setify(l.tail)
  }

  def main(args: Array[String]): Unit = {
    println(sorted(List(1,2,3,2)))
    println(delete(1, List(1,1,2,3,4,1,2,5,1)))
    println(length(List(1,2,3,4,5)))

    println(dot(List(1,2,3), List(1,2,3)))
    println(dotAcc(List(1,2,3), List(1,2,3), 0))
  }
}