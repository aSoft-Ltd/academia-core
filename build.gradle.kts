plugins {
    alias(androidx.plugins.library) apply false
    alias(kotlinz.plugins.root.multiplatform) apply false
    alias(kotlinz.plugins.root.serialization) apply false
    alias(kotlinz.plugins.compose) apply false
    alias(kotlinz.plugins.root.compiler.compose) apply false
    alias(kotlinz.plugins.root.android) apply false
    alias(kotlinx.plugins.rpc) apply false
}

allprojects {
    repositories {
        mavenCentral()
        google()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    group = "tz.co.asoft"
    version = "0.0.0"
}