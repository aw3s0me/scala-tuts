/**
  * Created by akorovin on 21.12.2016.
  */
object TestString {
  def main(args: Array[String]): Unit = {
    var randSent = "I saw a dragon fly by"

    // indexing of string
    println("3rd index of string: " + randSent(3))

    // length
    println("length of string" + randSent.length)

    // concatenation
    println(randSent.concat(" and explode"))

    // comparison
    println("Are strings equal: " + "I saw a dragon".equals(randSent))

    // find a match
    println("dragon starts at index: " + randSent.indexOf("dragon"))

    // convert to array
    val arr = randSent.toArray
    print("[")
    for (v <- arr)
      print(v)
    print("]")
  }
}
