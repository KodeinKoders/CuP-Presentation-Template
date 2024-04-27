# CuP Template project

This project is a template for a [Compose ur Pres](https://github.com/KodeinKoders/CuP) project.

1. Edit [settings.gradle.kts](settings.gradle.kts):
    - Change the name of your project (which will define the package of the compose Res class).
2. Edit [build.gradle.kts](build.gradle.kts):
    - Choose if you want to export your presentation as a Web page (target web).
    - Select the plugins you want to activate in your presentation.
    - Choose to compose your presentation with material 2 or material 3.
3. Edit [src/commonMain/kotlin/main.kt](src/commonMain/kotlin/main.kt):
    - Change the title of your presentation.
    - Configure & apply your theme.
    - Configure the plugins you selected in your build config.
4. **Write your slides!**
    - Write each slide in [src/commonMain/kotlin/slides/](src/commonMain/kotlin/slides/).
    - Report them in order in [src/commonMain/kotlin/main.kt](src/commonMain/kotlin/main.kt).
5. Run your presentation:
    - On desktop with the `./gradlew run` command.
    - On the web (if you chose to target it) with the `./gradlew wasmJsBrowserRun` command.
6. Export your presentation web page (if target web):
    - If you are using Github Pages, run the `./gradlew distDoc` command that will generate the web page in the `doc/` directory.
    - If you are using another system, run the `./gradlew wasmJsBrowserDistribution`  command that will generate the web page in the `build/dist/wasmJs/productionExecutable` directory.
7. Change this README to present your presentation ;)
