/**
  * Created by akorovin on 23.12.2016.
  */
object TestAbstract {
  def main(args: Array[String]): Unit = {
    val fang = new Wolf("Fang")
    fang.moveSpeed = 36.0
    println(fang.move)
  }

  /**
    * Cannot be instantiated
    * @param name
    */
  abstract class Mammal(val name: String) {
    // field that has no value assigned to it
    var moveSpeed: Double

    // ABSTRACT METHOD. empty body
    def move: String
  }

  class Wolf(name: String) extends Mammal(name) {
    override var moveSpeed: Double = 35.0

    // ABSTRACT METHOD. empty body
    override def move: String = "The wolf %s runs %.2f mph".format(this.name, this.moveSpeed)
  }
}
