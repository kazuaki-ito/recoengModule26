name := """recoengModule26"""
organization := "com.ruimo"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.2"

publishTo := Some(
  Resolver.file(
    "mqtt",
    new File(Option(System.getenv("RELEASE_DIR")).getOrElse("/tmp"))
  )
)

resolvers += "ruimo.com" at "http://static.ruimo.com/release"

libraryDependencies += guice
libraryDependencies += ws
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.0" % Test
libraryDependencies += "com.ruimo" %% "recoengcommon" % "1.1"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
