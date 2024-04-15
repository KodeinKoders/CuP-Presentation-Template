import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import org.kodein.emoji.compose.EmojiService
import net.kodein.cup.Presentation
import net.kodein.cup.Slides
import net.kodein.cup.cupApplication
import net.kodein.cup.laser.laser
import net.kodein.cup.speaker.speakerMode
import slides.intro
import slides.todo


fun main() = cupApplication(
    // TODO: Change title
    title = "My Amazing Presentation!"
) {
    remember {
        // https://github.com/kosi-libs/Emoji.kt?tab=readme-ov-file#initializing-the-emoji-service
        EmojiService.initialize()
    }

    MaterialTheme(
        // TODO: Apply your theme
        colors = darkColors()
    ) {
        Presentation(
            slides = presentationSlides,
            configuration = {
                // TODO: Configure plugins
                speakerMode()
                laser()
            },
            backgroundColor = MaterialTheme.colors.background
        ) {
            CompositionLocalProvider(
                LocalContentColor provides MaterialTheme.colors.onBackground
            ) {
                Slides()
            }
        }
    }
}

// TODO: Write your own slides!
val presentationSlides = Slides(
    intro,
    todo
)
