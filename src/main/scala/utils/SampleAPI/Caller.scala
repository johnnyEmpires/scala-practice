package utils.SampleAPI

// imports here
import com.typesafe.scalalogging.Logger


// package practice implementation
object Caller {
    def call(): Unit = {
        println("calling from SampleAPI")
        }

    def looper(): Unit = {

        val logger = Logger("Root")

        for( a <- 1 to 10) {
            // println( "Value of a: " + a );
            logger.info("Value of a: " + a)
        }
    }
}