package practice

object getType {

	def printType[T](item: T): Unit = {
		println(item.getClass.toString())
	}

}