import net.civmc.civgradle.CivGradleExtension

plugins {
    `java-library`
    id("net.civmc.civgradle") version "2.+"
}

configure<CivGradleExtension> {
    pluginName = project.property("pluginName") as String
}

repositories {
    mavenCentral()

    maven("https://jitpack.io")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://repo.civmc.net/repository/maven-public/")
}

dependencies {
    compileOnly("net.md-5:bungeecord-api:1.18-R0.1-SNAPSHOT")
    compileOnly("net.civmc:zeus:2.0.0-SNAPSHOT")
}