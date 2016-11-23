import sbtbuildinfo.BuildInfoPlugin.autoImport._

enablePlugins(BuildInfoPlugin)
enablePlugins(GitVersioning)
enablePlugins(GitBranchPrompt)

name := "slick-gen"

organization := "com.wellfactored"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.wellfactored" %% "property-info" % "1.0.0",
  "com.typesafe.slick" %% "slick" % "3.1.1"
)


buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion)

buildInfoPackage := "com.wellfactored.slickgen.buildinfo"

buildInfoOptions ++= Seq(BuildInfoOption.ToJson, BuildInfoOption.BuildTime)