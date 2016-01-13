package wordgen

import scala.io.Source

class FileCorpus( filePath: String ) extends Iterable[Word] {
  override def iterator: Iterator[Word] = Source.fromFile( filePath ).getLines()
}
