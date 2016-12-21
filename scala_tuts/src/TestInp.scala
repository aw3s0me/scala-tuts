// importing multiple methods in brackets
import scala.io.StdIn.{readLine, readInt}

/**
  * Created by akorovin on 21.12.2016.
  */
object TestInp {
  def main(args: Array[String]): Unit = {
    var numberGuess = 0

    do {
      print("Guess a number: ")
      // use readLine to read string and then cast to int
      numberGuess = readLine.toInt
    }
    while (numberGuess != 15)

    // print format method
    printf("You guessed a secret number %d\n", numberGuess)
  }
}
