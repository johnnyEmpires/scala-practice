package sample

import utils.Messenger.Greet
import utils.SampleAPI.Caller
import utils.SampleAPI.Caller.looper
import utils.SampleAPI.Caller.openFile
import practice.getType
import guiPractice.baseGui
import guiPractice.ScalaFXHelloWorld
import guiPractice.HelloStageDemo
import guiPractice.LineChartSample

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.effect.DropShadow
import scalafx.scene.layout.HBox
import scalafx.scene.paint.Color._
import scalafx.scene.paint.{Stops, LinearGradient}
import scalafx.scene.text.Text

// You can name the object same as project name or app name
object sampleApp {

	def main(args: Array[String]): Unit = {
		subFunc()
		// ScalaFXHelloWorld.main(args)
		// HelloStageDemo.main(args)
		LineChartSample.main(args)
	}

	def subFunc(): Unit = {
		// blank line separator
		println("\n", "-" * 60)

		println("Welcome to my scala program!")
		// Greet()
		// Caller.call()
		// looper()
		// openFile()
		// val x : Int= 5
		// val name : String = "scala"
		// getType.printType(x)
		// getType.printType(name)
		// baseGui.show()

		Thread.sleep(1000);

		// blank line separator
		println();
	}

}