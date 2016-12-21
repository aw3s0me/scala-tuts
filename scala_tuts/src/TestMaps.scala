/**
  * Created by akorovin on 21.12.2016.
  */
object TestMaps {
  def main(args: Array[String]): Unit = {
    // INSTANTIATE a map
    // NOTE: IMMUTABLE MAP. Cannot change it after instantiation
    val employees = Map(
      "Manager" -> "Bob",
      "Secretary" -> "Sue")

    // CHECK IF CONTAINS key and then output value
    if (employees.contains("Manager")) {
      printf("Manager %s \n", employees("Manager"))
    }

    // NOTE: MUTABLE MAP
    val customers = scala.collection.mutable.Map(
      100 -> "Paul",
      200 -> "John")

    if (customers.contains(100)) {
      printf("Customer %s \n", customers(100))
    }

    // MODIFY value for key
    customers(100) = "Tom"
    printf("Customer %s \n", customers(100))

    // ADD
    customers(300) = "Zurab"
    printf("Customer %s \n", customers(300))

    // FOREACH BY BOTH KEY-VALUE
    for ((k, v) <- customers) {
      printf("Customers with key %d and value %s \n", k, v)
    }
  }
}
