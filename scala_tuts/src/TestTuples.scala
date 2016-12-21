/**
  * Created by akorovin on 21.12.2016.
  */
object TestTuples {
  def main(args: Array[String]): Unit = {
    // INSTANTIATE TUPLE
    var tupleMarge = (103, "Marge Simpson", 10.25)
    // ACCESS TUPLE by underscore
    printf("%s owes us $%.2f\n", tupleMarge._2, tupleMarge._3)
    // ITERATE through each element in tuple
    tupleMarge.productIterator.foreach{i => println(i)}
  }
}
