lazy val root = (project in file(".")).enablePlugins(plugins: _*).settings(
  name := "play-docker-minimal",
  organization := "com.example",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.11.8",
  dockerBaseImage := "openjdk:8-alpine",
  packageName in Docker := "play-docker-minimal",
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.0.1" % "test"
  )
)

lazy val plugins = Seq(
  PlayScala,
  DockerPlugin,
  AshScriptPlugin
)
