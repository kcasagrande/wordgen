package wordgen

class SimpleCorpus(words: Word* ) extends Iterable[Word] {
  override def iterator: Iterator[Word] = words.iterator
}
