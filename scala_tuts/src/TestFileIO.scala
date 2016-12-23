import java.io.PrintWriter

import scala.io.Source

/**
  * Created by akorovin on 23.12.2016.
  */
object TestFileIO {
  def main(args: Array[String]): Unit = {
    // WRITING TO FILE (use PrintWriter)
    val writer = new PrintWriter("test.txt")
    writer.write("Just some random text\nNext line")
    writer.close
    // READING FROM FILE (use Source)
    val textFromFile = Source.fromFile("test.txt", "UTF-8")
    // ITERATE THROUGH LINES IN FILE
    val lineIterator = textFromFile.getLines

    for (line <- lineIterator)
      println(line)
    textFromFile.close
  }
}
