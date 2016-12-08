lazy val root = (project in file(".")).enablePlugins(PlayScala).settings(
  name := "play-minimal",
  organization := "com.example",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.11.8",
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.0.1" % "test"
  )
)
