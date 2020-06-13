import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.1.1"
  lazy val nifiApi = "org.apache.nifi" % "nifi-web-api" % "1.11.4"
  lazy val palyTest = "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
}
