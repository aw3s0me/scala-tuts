import scala.collection.mutable.ArrayBuffer

/**
  * Created by akorovin on 21.12.2016.
  */
object TestArrays {
  def main(args: Array[String]): Unit = {
    // define array of type int of size 20
    val favNums = new Array[Int](20)

    // define array that will be already initialized
    val friends = Array("Tom", "Bob")
    println("best friends old: " + friends(0))

    // changing values of array by using index
    friends(0) = "Alex"

    println("best friends: " + friends(0))

    // ArrayBuffer
    val friends2 = new ArrayBuffer[String]()
    // insert at index 0 new freind
    friends2.insert(0, "Phil")
    println("Array buffer friend array element at index 0: " + friends2(0))
    // add element by next available slot in array
    friends2 += "Mark"
    println("Array buffer new element: " + friends2(1))
    // METHOD1. add multiple different values by using ++ operator
    friends2 ++= Array("Mary", "Jay")
    println("New elements after ++: " + friends2(2) + ", " + friends2(3))
    // METHOD2. add multiple different values by using insert method
    friends2.insert(1, "Max", "Ostin", "Voss", "John")
    println("before length: " + friends2.length)
    // Remove 2 elements from 2nd index
    friends2.remove(1, 2)
    println("after removal length: " + friends2.length)

    // METHOD1. looping through an array
    for (friend <- friends2)
      println(friend)

    // METHOD2. looping through an array
    for (j <- friends2.indices) {
      println(friends2(j))
    }

    // METHOD3. looping through an array
    for (j <- 0 to (friends2.length - 1)) {
      println(friends2(j))
    }

    // init fav nums
    for (i <- favNums.indices)
      favNums(i) = i

    // create an array using for loop
    val favNumsTimes2 = for (num <- favNums) yield 2 * num

    // METHOD4. looping through an array
    favNumsTimes2.foreach(println)

    val favNumsDiv4 = for (num <- favNums if num % 4 == 0) yield num / 4

    favNumsDiv4.foreach(println)

    // multidimensional array
    var multTable = Array.ofDim[Int](10, 10)

    for (i <- 0 to 9)
      for (j <- 0 to 9)
        multTable(i)(j) = i * j

    for (i <- 0 to 9)
      for (j <- 0 to 9)
        printf("%d : %d = %d\n", i, j, multTable(i)(j))

    // different array functions example
    println("Sum: " + favNums.sum)
    println("Min: " + favNums.min)
    println("Max: " + favNums.max)

    // sorting array
    // descending
    val sortedNums = favNums.sortWith(_ > _)
    val sortedNumsAsc = favNums.sortWith(_ < _)

    // create string from array
    println("DSC:" + sortedNums.deep.mkString(" ,"))
    println("ASC:" + sortedNumsAsc.deep.mkString(" ,"))
  }
}
