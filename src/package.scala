package object wordgen {
  sealed trait Symbol
  object Mark extends Symbol
  case class Letter( value: Char ) extends Symbol
  type Word = String

  class Prefix extends Iterable[Symbol] {
    override def iterator: Iterator[Symbol] = ???
  }
}
