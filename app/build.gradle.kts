plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("com.google.firebase.crashlytics")
    id("com.huawei.agconnect")
    id("com.huawei.hms.plugin.analytics")
}

android {

    compileSdkVersion(29)

    defaultConfig {
        applicationId = "tech.hmsfirebaseservices"
        minSdkVersion(19)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
        multiDexEnabled = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    flavorDimensions("env", "services")

    productFlavors {
        create("dev") {
            setDimension("env")
            applicationIdSuffix = ".dev"
        }

        create("uat") {
            setDimension("env")
            applicationIdSuffix = ".uat"
        }

        create("prod") {
            setDimension("env")
        }
        create("google") {
            setDimension("services")
        }
        create("huawei") {
            setDimension("services")
        }
    }
}

sourceSets {
    create("google") {
        java {
            srcDir("src/google/java")
        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8

    registerFeature("google") {
        usingSourceSet(sourceSets["google"])
    }
}

dependencies {
    // JetBrains
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")

    // AndroidX
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.navigation:navigation-ui:2.2.2")
    implementation("androidx.navigation:navigation-fragment-ktx:2.2.2")
    implementation("androidx.navigation:navigation-ui-ktx:2.2.2")
    implementation("androidx.navigation:navigation-fragment-ktx:2.2.2")
    implementation("androidx.multidex:multidex:2.0.1")

    // Google
//    implementation("com.google.android.material:material:1.1.0")
    // googleImplementation("com.google.android.material:material:1.1.0")
    implementation("com.google.android.material:material:1.1.0")
    implementation("com.google.maps.android:android-maps-utils:2.0.3")
    implementation("com.google.maps.android:maps-utils-ktx:1.7.0")
    implementation("com.google.android.gms:play-services-maps:17.0.0")

    // Firebase
    "googleImplementation"("com.google.firebase:firebase-analytics:17.2.2")
    "googleImplementation"("com.google.firebase:firebase-crashlytics:17.1.1")
    "googleImplementation"("com.google.firebase:firebase-analytics:17.2.2")

    // Huawei
    "huaweiImplementation"("com.huawei.agconnect:agconnect-core:1.4.0.300")
    implementation("com.huawei.hms:hianalytics:5.0.1.300")
    "huaweiImplementation"("com.huawei.agconnect:agconnect-crash:1.4.0.300")
    "huaweiImplementation"("com.huawei.hms:maps:5.0.1.300")

    // Others
    implementation("org.koin:koin-android:2.1.5")
    implementation("org.koin:koin-androidx-fragment:2.1.5")

    // Test
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.1.0-alpha4")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0-alpha4")
}