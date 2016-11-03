lazy val root = (project in file(".")).
  settings(
    name := "sbt-template", // TODO Change it
    version := "0.1.0",
    scalaVersion := "2.12.0",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.4.12"
    )
  )
