lazy val root = (project in file(".")).
  settings(
    name := "sbt-template", // TODO Change it
    version := "0.1.0",
    scalaVersion := "2.11.8",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http-core" % "2.4.10"
    )
  )
