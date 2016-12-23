import scala.math._

/**
  * Created by akorovin on 23.12.2016.
  * Functions that can be passed as variables
  */
object TestHigherOrderFunctions {
  def main(args: Array[String]): Unit = {
    // STORE functions. put underscore after
    val log10Func = log10 _
    // RUN
    println(log10Func(1000))

    // APPLY FUNC TO EVERY ELEMENT IN LIST
    println("Apply map to list")
    List(1000.0, 10000.0).map(log10Func).foreach(println)

    // APPLY LAMBDA
    println("Apply lambda in map")
    List(1,2,3,4,5).map((x: Int) => x * 50).foreach(println)

    println("Get only even numbers")
    // put underscore to every item in that list
    List(1,2,3,4,5).filter(_ % 2 == 0).foreach(println)

    def times3(num: Int) = num * 3
    def times4(num: Int) = num * 4

    def multIt(func: (Int) => Double, num: Int) = {
      func(num)
    }

    println("3 * 100 = " + multIt(times3, 100))
    println("4 * 200 = " + multIt(times4, 200))
  }
}
