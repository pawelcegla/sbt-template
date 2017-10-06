lazy val root = (project in file(".")).
  settings(
    name := "sbt-template", // TODO Change it
    version := "0.1.0",
    scalaVersion := "2.12.3",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.5.6"
    )
  )
