package wordgen

class FileCorpusTest extends TestCase {
  "A FileCorpus" must "give the words in the file, in the same order" in {
    val corpusIterator = new FileCorpus( "test-assets/simple.txt" ).iterator
    assert( corpusIterator.next() == "abri", "The first word should be \"abri\"." )
    assert( corpusIterator.next() == "loup", "The second word should be \"loup\"." )
    assert( corpusIterator.next() == "nem", "The third word should be \"nem\"." )
    assert( corpusIterator.next() == "ys", "The fourth word should be \"ys\"." )
  }
}

