// Project-level build.gradle
buildscript {
    repositories {
        google()  // Make sure this is included
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.2")  // Adjust based on your project setup
        classpath("com.google.gms:google-services:4.3.15") // Adjust if necessary
    }
}

