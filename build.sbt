name := "location-data-importer"

version := "0.2"

scalaVersion := "2.11.7"

parallelExecution := false

libraryDependencies ++= Seq(
    "org.geotools" % "gt-main" % "9.3",
    "org.geotools" % "gt-epsg-hsql" % "9.3",
    "com.github.scopt" %% "scopt" % "3.3.0",
    "com.github.scala-incubator.io" % "scala-io-core_2.11" % "0.4.3",
    "org.mongodb" %% "casbah" % "2.8.2",
    "com.novus" % "salat-core_2.11" % "1.9.9",
    "org.specs2" %% "specs2-core" % "3.6.6" % "test",
    "org.specs2" % "specs2-mock_2.11" % "3.6.6" % "test"
)

resolvers ++= Seq(
    "maven" at "http://download.java.net/maven/2",
    "maven-geotools" at "http://maven.geotoolkit.org",
    "geotools" at "http://download.osgeo.org/webdav/geotools",
    "sonatype-public" at "https://oss.sonatype.org/content/groups/public",
    "GDS maven repo snapshots" at "http://alphagov.github.com/maven/snapshots"
)
