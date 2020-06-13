import Dependencies._

ThisBuild / scalaVersion     := "2.13.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "org.thompson"
ThisBuild / organizationName := "thompson"

lazy val root = (project in file("."))
  .settings(
    name := "my-cdp",
    libraryDependencies += scalaTest % Test
  )
lazy val nifiTemplates = (project in file("nifi-templates"))
  .settings(
    name := "nifi-templates"
  )

lazy val myCdpApi = (project in file("my-cdp-api"))
  .enablePlugins(PlayScala)
  .settings(
    name := "my-cdp-api",
    libraryDependencies ++= List (nifiApi, palyTest, guice)
  )

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "org.thompson.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "org.thompson.binders._"