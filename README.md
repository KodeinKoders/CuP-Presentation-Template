# CuP Template project

This project is a template for a [Compose ur Pres](https://github.com/KodeinKoders/CuP) project.

1. Edit [settings.gradle.kts](settings.gradle.kts):
    - Change the name of your project (which will define the package of the compose Res class).
2. Edit [gradle/libs.versions.toml](gradle/libs.versions.toml):
    - Select the plugins you want to activate in your presentation *(both in libraries & bundles)*.
    - Choose to compose your presentation with material 2 or material 3 *(both in libraries & bundles)*.
    - Declare any other additional dependencies.
3. Edit [build.gradle.kts](build.gradle.kts):
    - Choose if you want to export your presentation as a Web page (target web).
    - Add any additional dependencies.
4. If you are not targetting the web, or don't want to deploy your presentation as a Github page, delete the [.github/workflows/pages.yml](.github/workflows/pages.yml) file.
5. Edit [src/commonMain/kotlin/main.kt](src/commonMain/kotlin/main.kt):
    - Change the title of your presentation.
    - Configure & apply your theme.
    - Configure the plugins you selected in your build config.
6. **Write your slides!**
    - Write each slide in [src/commonMain/kotlin/slides/](src/commonMain/kotlin/slides/).
    - Report them in order in [src/commonMain/kotlin/main.kt](src/commonMain/kotlin/main.kt).
7. Run your presentation:
    - On desktop with the `./gradlew run` command (or `./gradlew hotRunJvm` to use Compose Hot Reload).
    - On the web (if you chose to target it) with the `./gradlew wasmJsBrowserRun` command.
8. Export your presentation web page (if targetting the web):
    - If you are using Github Pages, everything is taken care of by [.github/workflows/pages.yml](.github/workflows/pages.yml).
    - If you are using another system, run the `./gradlew wasmJsBrowserDistribution`  command that will generate the web page in the `build/dist/wasmJs/productionExecutable` directory.
9. Change this README to present your presentation ;)
