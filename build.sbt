import sbtbuildinfo.BuildInfoPlugin.autoImport._

enablePlugins(BuildInfoPlugin)
enablePlugins(GitVersioning)
enablePlugins(GitBranchPrompt)

name := "slick-gen"

organization := "com.wellfactored"

crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.1")

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.wellfactored" %% "property-info" % "1.1.1"
)


git.useGitDescribe := true

buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion)

buildInfoPackage := "com.wellfactored.slickgen.buildinfo"

buildInfoOptions ++= Seq(BuildInfoOption.ToJson, BuildInfoOption.BuildTime)