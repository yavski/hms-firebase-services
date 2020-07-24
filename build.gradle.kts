// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
        maven("https://developer.huawei.com/repo/")
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:3.6.3")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")

        // Google
        classpath ("com.google.gms:google-services:4.3.3")
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.2.0")

        // Huawei
        classpath("com.huawei.agconnect:agcp:1.4.0.300")
        classpath("com.huawei.hms.plugin:analytics:5.0.1.300")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven("https://developer.huawei.com/repo/")
    }
}

tasks.register("clean").configure {
    delete("build")
}