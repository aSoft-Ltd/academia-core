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

rootProject.name = "academia-core"

includeSubs("academia", ".", "dtos", "schemes")
