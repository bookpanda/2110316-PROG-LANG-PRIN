package HW01

object Question09 {
  val tape: List[Char] = List('C','H','A','R')
  def turingStep(f: Char => Char, tape: List[Char], n: Int): List[Char] = {
    if(tape.isEmpty) return List()
    if(n == 0) return tape
    f(tape.head) :: turingStep(f, tape.tail, n-1)
  }
  def toLowerCase(s: Char): Char = {
    s.toLower
  }
  def main(args: Array[String]) = {
    println(turingStep(toLowerCase, tape, 2))
    println(turingStep(toLowerCase, tape, 3))
    println(turingStep(toLowerCase, tape, 0))
    println(turingStep(toLowerCase, tape, 5))
  }

}
