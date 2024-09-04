@file:OptIn(ExperimentalComposeLibrary::class)

import org.jetbrains.compose.ExperimentalComposeLibrary
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSetTree
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.npm.tasks.KotlinNpmInstallTask

plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
}

description = "The common interfaces between the two shared modules"

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
            api(projects.academiaDtos)
            api(libs.raven.outbox.core)
        }

        commonTest.dependencies {
            implementation(libs.kommander.coroutines)
        }
    }
}

rootProject.the<NodeJsRootExtension>().apply {
    version = npm.versions.node.version.get()
    downloadBaseUrl = npm.versions.node.url.get()
}

rootProject.tasks.withType<KotlinNpmInstallTask>().configureEach {
    args.add("--ignore-engines")
}