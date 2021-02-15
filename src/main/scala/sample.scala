import utils.Messenger.Greet
import utils.SampleAPI.Caller
import utils.SampleAPI.Caller.looper
import utils.SampleAPI.Caller.openFile
import practice.getType

// You can name the object same as project name or app name
object sample {
  def main(args: Array[String]): Unit = {

  	// blank line separator
  	println();

    println("Welcome to my scala program!")
    // Greet()
    // Caller.call()
    // looper()
    // openFile()
    val x : Int= 5
    val name : String = "scala"
    getType.printType(x)
    getType.printType(name)

    Thread.sleep(1000);

  	// blank line separator
  	println();

  }
}