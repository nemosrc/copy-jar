# Gradle copy-jar
Copy jar into other directories on build task<br/>

## build.gradle
```gradle
plugins {
  id "com.nemosw.copy-jar" version "1.0"
}

copyJar {
    into '../server/byString
    into file('../server/byFile')
    into { '../server/byclosure' }
}
```
#### Dynamic plugin apply
```gradle
buildscript {
  repositories {
    maven {
      url "https://plugins.gradle.org/m2/"
    }
  }
  dependencies {
    classpath "gradle.plugin.com.nemosw:copy-jar:1.0"
  }
}

apply plugin: "com.nemosw.copy-jar"
```

### Link
https://plugins.gradle.org/plugin/com.nemosw.copy-jar
