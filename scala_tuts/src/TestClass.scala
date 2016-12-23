/**
  * Created by akorovin on 21.12.2016.
  */
object TestClass {
  def main(args: Array[String]): Unit = {
    // PARAMETERLESS CONSTRUCTOR
    var rover = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    printf("%s says %s\n", rover.getName, rover.getSound)

    val whisker = new Animal("Whisker", "Meow")
    println(s"${whisker.getName} with id ${whisker.id} says ${whisker.getSound}")
    println("getter-setter test")
    whisker.prop1 = "val1"
    println(whisker.prop1)
    whisker.prop1 = "val2"
    println(whisker.prop1)
  }

  // DEFINITION (usually done outside of main)
  // DEFAULT CONSTRUCTOR == PARAMETERS
  class Animal(var name : String, var sound : String) {
    // DEFAULT CONSTRUCTOR STARTS HERE

    this.setName(name)

    // DEFINITION OF VARIABLES
    val id = Animal.newIdNum
    protected var _prop1: String = "prop"
    // FIELD PROTECTED (also public, protected, private)
    protected var field: String = "Field"

    // GETTERS and SETTERS. VARIANT 1. WORSE THAN VARIANT 1
    def getName() : String = this.name
    def getSound() : String = this.sound

    def setName(name: String): Unit = {
      // CHECK IF NAME CONTAINS NUMBER
      if (!name.matches(".*\\d+.*")) {
        this.name = name
      }
      else {
        this.name = "NO MATCH"
      }
    }

    def setSound(sound: String): Unit = {
      this.sound = sound
    }

    // GETTERS and SETTERS. VARIANT 2. BETTER
    def prop1:String = _prop1

    def prop1_=(propVal: String): Unit = {
      _prop1 = propVal
    }

    // CUSTOM CONSTRUCTOR
    def this(name : String) {
      this("No name", "No sound")
      this.setName(name)
    }

    def this() {
      this("No name", "No sound")
    }

    override def toString: String = {
      "%s says with the id %d says %s".format(this.name, this.id, this.sound)
    }
  }

  // companion object for animal class, to find static variables
  // is used to create static fields and methods
  object Animal {
    private var idNumber = 0
    private def newIdNum: Int = {
      idNumber += 1
      idNumber
    }
  }
}
