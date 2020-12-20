package utils.SampleAPI


// package practice implementation
object Caller {
    def call(): Unit = {
        println("calling from SampleAPI")
        }

    def looper(): Unit = {
        // for loop execution with a range
        for( a <- 1 to 10) {
            println( "Value of a: " + a );
        }
    }
}