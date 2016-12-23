import TestClass.Animal

/**
  * Created by akorovin on 23.12.2016.
  */
object TestInheritance {
  def main(args: Array[String]): Unit = {
    val spike = new Dog("Spike", "Rawwr", "Grr")
    println(spike)
  }

  /**
    * Use extends, to inherit from base class
    * Pass parameters to previous default constructor
    * @param name
    * @param sound
    * @param growl
    */
  class Dog(name: String, sound: String, growl: String) extends Animal(name, sound) {
    def this(name: String, sound: String) {
      // calling default constructor
      this("No Name", sound, "No growl")
      this.setName(name)
    }

    def this(name: String) {
      // calling default constructor
      this("No Name", "No Sound", "No growl")
      this.setName(name)
    }

    def this() {
      // calling default constructor
      this("No Name", "No Sound", "No growl")
    }

    override def toString: String = {
      "%s says with the id %d says %s with growl %s".format(this.name, this.id, this.sound, this.growl)
    }
  }
}
