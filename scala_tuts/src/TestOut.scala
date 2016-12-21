import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

/**
  * Created by akorovin on 21.12.2016.
  */
object TestOut {
  def main(args: Array[String]): Unit = {
    val name = "Alex"
    val age = 23
    val weight = 65.5

    // printing out variables. need "s" in front of string
    println(s"Hello $name")

    // print out formatted. $age+1 - to calculate + 1 age, weight.2 for double decimal
    println(f"I am ${age + 1} and weight $weight%.2f")
  }
}
