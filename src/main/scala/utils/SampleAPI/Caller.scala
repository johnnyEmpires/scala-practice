package utils.SampleAPI

// imports here
import com.typesafe.scalalogging.Logger


// package practice implementation
object Caller {

    val logger = Logger("Root")

    def call(): Unit = {
        println("calling from SampleAPI")
        }

    def looper(): Unit = {
        for( a <- 1 to 10000) {
            // println( "Value of a: " + a );
            logger.info("Value of a: " + a)
        }
    }

    def openFile(): Unit = {
        val bs = io.Source.fromFile("./data/data-latest.csv")
        for (line <- bs.getLines) {
            // logger.info(line)
        }

    }
}