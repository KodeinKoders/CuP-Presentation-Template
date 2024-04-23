package slides

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import cup_presentation_template.generated.resources.Res
import cup_presentation_template.generated.resources.cup
import net.kodein.cup.Slide
import net.kodein.cup.ui.styled
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.kodein.emoji.Emoji
import org.kodein.emoji.compose.m2.TextWithPlatformEmoji
import org.kodein.emoji.smileys_emotion.face_smiling.Wink


@OptIn(ExperimentalResourceApi::class)
val intro by Slide {
    Image(
        painterResource(Res.drawable.cup),
        contentDescription = "Compose ur Pres",
        modifier = Modifier
            .size(96.dp)
            .clip(CircleShape)
    )

    Text(
        text = "Hello, friend!",
        style = MaterialTheme.typography.h1
    )
    TextWithPlatformEmoji(styled { "Welcome to ${+b}Compose ur Pres${-b}! ${Emoji.Wink}" })
}
