import utils.Messenger.Greet
import utils.SampleAPI.Caller
import utils.SampleAPI.Caller.looper
import utils.SampleAPI.Caller.openFile


// You can name the object same as project name or app name
object sample {
  def main(args: Array[String]): Unit = {

  	// blank line separator
  	println();

    println("Welcome to my scala program!")
    // Greet()
    Caller.call()
    // looper()
    // openFile()

    Thread.sleep(1000);

  	// blank line separator
  	println();

  }
}