/**
  * Created by akorovin on 21.12.2016.
  * NOTE: THEY ARE NOT PRIMITIVE TYPES
  * NOTE: THEY ARE CLASSES!
  * JUST SYNTACTICAL SUGAR
  * NOTE: MAX 22 TUPLES AVAILABLE (max 22 PARAMETERS)
  * NOTE: can change values only by copying
  */
object TestTuples {
  def main(args: Array[String]): Unit = {
    // INSTANTIATE TUPLE. TUPLE3 type (3 PARAMETERS)
    val tupleMarge: (Int, String, Double) = (103, "Marge Simpson", 10.25)
    // SAME AS
    val tupleMarge2: (Int, String, Double) = Tuple3(103, "Marge Simpson", 10.25)

    // ACCESS TUPLE by underscore
    printf("%s owes us $%.2f\n", tupleMarge._2, tupleMarge._3)
    // ITERATE through each element in tuple
    tupleMarge.productIterator.foreach{i => println(i)}
  }
}
