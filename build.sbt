import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "net.mcarolan",
      scalaVersion := "2.12.3",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "HelloHandler",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-core" % "1.1.0",
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-events" % "1.1.0",
    libraryDependencies += "io.github.yeghishe" %% "scala-aws-lambda-utils" % "0.0.3"
  )

assemblyMergeStrategy in assembly :=
  {
    case PathList("META-INF", xs @ _*) => MergeStrategy.discard
    case x => MergeStrategy.first
  }
