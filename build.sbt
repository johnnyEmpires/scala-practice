// Add OS specific JavaFX dependencies
val javafxModules = Seq("base", "controls", "fxml", "graphics", "media", "swing", "web")
val osName = System.getProperty("os.name") match {
	case n if n.startsWith("Linux") => "linux"
	case n if n.startsWith("Mac") => "mac"
	case n if n.startsWith("Windows") => "win"
	case _ => throw new Exception("Unknown platform!")
}

lazy val root = (project in file("."))
    .settings(
        name := "scala-practice",
        libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.3" % "test",
        libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3",
        libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.8.0",
		libraryDependencies += "org.scalafx" %% "scalafx" % "15.0.1-R21",
		libraryDependencies ++= javafxModules.map(m => "org.openjfx" % s"javafx-$m" % "15.0.1" classifier osName)
    )

enablePlugins(JavaAppPackaging)

/*
 * https://stackoverflow.com/questions/\
 * 44298847/why-do-we-need-to-add-fork-\
 * in-run-true-when-running-spark-sbt-application
 *
 * - ensure thread termination is handled correctly.
 * - https://www.scala-sbt.org/1.x/docs/Forking.html
 * - call JFXApp only once
 */
fork in run := true

// other objects have main method (such as JFXApp)
// make sure correct main method is set
// mainClass in (Compile, run) := Some("sample.sampleApp")
mainClass in Compile := Some("sample.sampleApp")
