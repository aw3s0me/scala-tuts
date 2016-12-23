/**
  * Created by akorovin on 23.12.2016.
  * MAIN IDEA OF CASE CLASSES - PATTERN MATCHING (LIKE IN PROLOG)
  * +++
  * ALSO CAN BE USED AS A DATA CONTAINER (BEAN CLASS)
  * +++
  * COMPARED BY STRUCTURAL EQUALITY INSTEAD OF REFERENCE
  * +++
  * ADVANTAGES:
  * Immutability frees you from needing to keep track of where and when things are mutated
Comparison-by-value allows you compare instances as if they are primitive values - no more uncertainty regarding whether instances of a class is compared by value or reference
Pattern matching simplifies branching logic, which leads to less bugs and more readable code.
  */
object TestCaseClass {
  def main(args: Array[String]): Unit = {
    val me = Person("Daniel", "Spiewak")
    // automatic conversion of constructor parameters to fields with getters setters
    val first = me.firstName
    val last = me.lastName

    // PATTERN MATCHING
    if (me == Person(first, last)) {
      println("Found myself!")
      println(me)
    }
    /** PATTERN MATCHING EXAMPLE **/
    def showNotification(notification: Notification): String = {
      notification match {
        case Email(email, title, _) =>
          "You got an email from " + email + " with title: " + title
        case SMS(number, message) =>
          "You got an SMS from " + number + "! Message: " + message
        case VoiceRecording(name, link) =>
          "you received a Voice Recording from " + name + "! Click the link to hear it: " + link
      }
    }
    val someSms = SMS("12345", "Are you there?")
    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
    println(showNotification(someSms))
    println(showNotification(someVoiceRecording))
    // prints:
    // You got an SMS from 12345! Message: Are you there?
    // you received a Voice Recording from Tom! Click the link to hear it: voicerecording.org/id/123
  }

  /**
    * !!Constructor parameters (firstname and lastname) will automatically become PUBLIC FIELDS (with getters and setters)
    * NOTE: using val in parameters - generates only getters
    * NOTE: using var - generates both getters and setters
    * !!Automatically create apply method (=> not necessary to use new keyword)
    * !!methods toString, hashCode, equals are created based on constructor fields
    * @param firstName
    * @param lastName
    */
  case class Person(var firstName: String, var lastName: String)
  // uncomment if want to generate only getters
  // case class Person(val firstName: String, val lastName: String)

  /** PATTERN MATCHING EXAMPLE **/
  abstract class Notification
  case class Email(sourceEmail: String, title: String, body: String) extends Notification
  case class SMS(sourceNumber: String, message: String) extends Notification
  case class VoiceRecording(contactName: String, link: String) extends Notification

}
