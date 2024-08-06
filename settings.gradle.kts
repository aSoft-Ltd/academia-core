pluginManagement {
    includeBuild("../build-logic")
//    includeBuild("build-logic-academia")
}

plugins {
    id("multimodule")
}

fun includeSubs(base: String, path: String = base, vararg subs: String) {
    subs.forEach {
        include(":$base-$it")
        project(":$base-$it").projectDir = File("$path/$it")
    }
}

//listOf(
//    "cinematic", "keep", "lexi", "captain", "neat", "kash-api", "geo-api",
//    "kash-client", "geo-client", "kiota",
//    "kronecker", "symphony", "epsilon-api", "epsilon-client", "krono-core", "krono-client", "hormone",
//    "krest", "sanity", "koncurrent", "kommander",
//).forEach { includeBuild("../$it") }

rootProject.name = "academia-core"

// includeSubs("academia", ".", "server", "compose", "desktop", "browser", "android")
