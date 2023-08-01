ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val commons = (project in file("commons"))

lazy val api = (project in file("api"))
  .dependsOn(commons)
  .enablePlugins(ScalatsGeneratorPlugin)
