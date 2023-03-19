plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.13.1"
}

group = "com.johngrib"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

// https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
// https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version.set("2022.1.4")
}

tasks {
    withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }

    buildSearchableOptions {
        enabled = false
    }

    patchPluginXml {
        sinceBuild.set("221")
        untilBuild.set("223.*")
    }
}
