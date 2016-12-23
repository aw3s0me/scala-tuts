/**
  * Created by akorovin on 23.12.2016.
  */
object TestExceptions {
  def main(args: Array[String]): Unit = {
    // TEST 0 DIVISION
    def divideNums(num1: Int, num2: Int) = try {
      num1 / num2
    } catch {
      case ex: ArithmeticException => "Can't divide by zero"
    } finally {
      // clean up
    }
    
    println("3 / 0: " + divideNums(3, 0))
  }
}
