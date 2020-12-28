lazy val root = (project in file("."))
    .settings(
        name := "scala-practice",
        libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.3" % "test",
        libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3",
        libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.8.0"
    )

enablePlugins(JavaAppPackaging)