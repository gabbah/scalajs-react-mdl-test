lazy val scalajsTutorial =
  Project(id = "scalajs-tutorial", base = file("."))
    .enablePlugins(ScalaJSPlugin)
    .settings(
      name := "Scala.js Tutorial",
      scalaVersion := "2.11.7",
      // core = essentials only. No bells or whistles.
      libraryDependencies ++= Seq(
        "com.github.japgolly.scalajs-react" %%% "core" % "0.11.0",
        "com.payalabs" %%% "scalajs-react-mdl" % "0.2.0-SNAPSHOT"),
      // React JS itself (Note the filenames, adjust as needed, eg. to remove addons.)
      jsDependencies ++= Seq(

        "org.webjars.bower" % "react" % "15.0.1"
          /        "react-with-addons.js"
          minified "react-with-addons.min.js"
          commonJSName "React",

        "org.webjars.bower" % "react" % "15.0.1"
          /         "react-dom.js"
          minified  "react-dom.min.js"
          dependsOn "react-with-addons.js"
          commonJSName "ReactDOM",

        "org.webjars.bower" % "react" % "15.0.1"
          /         "react-dom-server.js"
          minified  "react-dom-server.min.js"
          dependsOn "react-dom.js"
          commonJSName "ReactDOMServer"),

      persistLauncher in Compile := true,
      persistLauncher in Test := false
    )





