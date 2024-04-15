plugins {
    kotlin("multiplatform") version "1.9.23"
    id("org.jetbrains.compose") version "1.6.1"
    id("net.kodein.cup") version "1.0.0-Beta-01"
}

cup {
    targetDesktop()

    // TODO: Uncomment this if you want to export your slides as a web page
    //targetWeb()
}

kotlin {
    sourceSets.commonMain {
        dependencies {
            // Includes Source Code highlighting & animations.
            implementation(cup.sourceCode)

            // TODO: Select plugins (comment or uncomment function of your needs)

            // Secondary window with preview & speaker notes.
            implementation(cup.plugins.speakerWindow)

            // Allows to draw over the presentation on the main window.
            // This tool is also part of the Speaker Mode window.
            implementation(cup.plugins.laser)

            // TODO: Select material or material3 (for composables such as Text).
            implementation(compose.material)
//            implementation(compose.material3)
            implementation("org.kodein.emoji:emoji-compose-m2:1.3.0")
//            implementation("org.kodein.emoji:emoji-compose-m3:1.3.0")
        }
    }
}
