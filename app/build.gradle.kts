plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.pr9"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.pr9"
        minSdk = 21
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.material)
    implementation(libs.appcompat)
    implementation(libs.constraintlayout)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation("androidx.leanback:leanback:1.2.0")
}