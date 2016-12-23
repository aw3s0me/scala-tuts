/**
  * Created by akorovin on 23.12.2016.
  */
object TestTrait {
  def main(args: Array[String]): Unit = {
    val superman = new Superhero("Superman")
    println(superman.fly)
    println(superman.hitByBullet)
    println(superman.ricochet(2500))
  }

  trait Flyable {
    def fly: String
  }

  trait BulletProof {
    def hitByBullet: String

    def ricochet(startSpeed: Double): String = {
      "They bullet is going to ricochet at a speed of %.1f ft/sec".format(startSpeed * .75)
    }
  }

  /**
    * First extend to first trait
    * than extend to any further traits
    * @param name
    */
  class Superhero(val name: String) extends Flyable with BulletProof {
    override def fly: String = "%s flys through the air".format(this.name)

    override def hitByBullet: String = "The bullet bounces off of %s".format(this.name)
  }
}
