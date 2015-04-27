import bintray.Keys._

lazy val root = (project in file(".")).settings(
  sbtPlugin := true,
  
  name := "sbt-spark-ec2",
  version := "0.6.0",
  organization := "net.pishen",

  scalaVersion := "2.10.5",
  
  addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.13.0"),
  libraryDependencies ++= Seq(
    "net.ceedubs"        %% "ficus"            % "1.0.1",
    "com.github.seratch" %% "awscala"          % "0.5.2" excludeAll(ExclusionRule(organization = "com.amazonaws")),
    "com.amazonaws"      %  "aws-java-sdk-s3"  % "1.9.31",
    "com.amazonaws"      %  "aws-java-sdk-ec2" % "1.9.31"
  ),
  
  publishMavenStyle := false,
  bintrayPublishSettings,
  repository in bintray := "sbt-plugins",
  licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html")),
  bintrayOrganization in bintray := None
)
