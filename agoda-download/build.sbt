name := "agoda-download"

version := "1.0"

lazy val `agoda-download` = (project in file(".")).enablePlugins(PlayJava)

//scalaVersion := "2.11.7"

//libraryDependencies ++= Seq( javaJdbc ,  cache , javaWs )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

//resolvers ++= "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq("junit" % "junit" % "4.11" % "test",
"org.junit.platform" % "junit-platform-runner" % "1.0.0-M3" % "test",
"org.junit.jupiter" % "junit-jupiter-engine" % "5.0.0-M3" % "test",
"org.junit.vintage" % "junit-vintage-engine" % "4.12.0-M3" % "test",
  "org.mockito" % "mockito-all" % "1.10.19" % Test,
// This provides the SBT-TestInterface for JUnit.
// Without this on the classpath, no tests will be executed by SBT
"com.novocode" % "junit-interface" % "0.11" % "test")