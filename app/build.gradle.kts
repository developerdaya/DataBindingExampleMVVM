plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.developerdaya.dihiltexample"
    compileSdk = 34

  
    viewBinding {
        enable = true
    }
    dataBinding{
        enable  = true
    }

    defaultConfig {
        applicationId = "com.developerdaya.dihiltexample"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation ("com.google.code.gson:gson:2.8.7")
    implementation ("io.reactivex.rxjava2:rxjava:2.2.21")
    implementation ("io.reactivex.rxjava2:rxandroid:2.1.1")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.retrofit2:adapter-rxjava2:2.9.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2")
    implementation ("androidx.lifecycle:lifecycle-common-java8:2.5.0-alpha04")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.5.0-alpha04")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.5.0-alpha04")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.0-alpha04")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-savedstate:2.5.0-alpha04")


}