@file:OptIn(ExperimentalComposeLibrary::class)

import org.jetbrains.compose.ExperimentalComposeLibrary
plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
}

description = "The DTOs that are being shared accross the server and the client"

kotlin {
    jvm {
        tasks.withType<Test> {
            useJUnitPlatform()
        }
    }
    wasmJs { browser() } // until coil and kotlinx-datetime supports this, we ain't gonna
    val ios = listOf(iosArm64(), iosX64(), iosSimulatorArm64())

    sourceSets {
        commonMain.dependencies {
            api(libs.lexi.api)
            api(libs.koncurrent.later.coroutines)
            api(kotlinx.serialization.json)?.because("We are implementing art json renderer for now. If art is removed, we no longer need this dependency")
        }

        commonTest.dependencies {
            implementation(libs.kommander.coroutines)
        }
    }
}

