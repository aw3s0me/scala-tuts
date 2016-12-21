/**
  * Created by akorovin on 20.12.2016.
  */
object Test {
  def main(args: Array[String]): Unit = {
    // var is for variables
    var age = 18
    // val is for constants (cannot change)
    val canVote = if(age >= 18) "yes" else "no"
    print(age + " :" + canVote)

    // while loop example
    var i = 0
    while (i <= 5) {
      println(i)
      i += 1
    }

    // for loop example
    var j = 0
    for (j <- 6 to 10) {
      println(j)
    }

    // for loop for iterators
    var k = 0
    val str = "abcdefg"
    for (k <- 0 until str.length) {
      println(str(k))
    }

    // for loop for list example
    val listExample = List(1,2,3,4,5)
    for (k <- 0 until listExample.length) {
      println(listExample(k))
    }

    // create list example
    val evenList = for
    {
      i <- 1 to 20 if (i % 2) == 0
    } yield i

    println(evenList)

    // double loop
    for (i <- 0 to 5; j <- 0 to 5) {
      println("i: " + i + " , j:" + j)
    }

    // create function example
    def printPrimes(): Unit = {
      val primeList = List(1,3,5,7,11)
      for (i <- primeList) {
        // there is no brake or continue in scala. However you can use return
        if (i == 11) {
          return
        }

        // continue statement example
        if (i != 1) {
          println(i)
        }
      }
    }

    // execution of function. empty parameter method accessed as parameterless
    printPrimes

  }
}
