package com.gigo.storyflow.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = AccentPurple,
    secondary = AccentPurpleLight,
    background = BackgroundDark,
    surface = CardDark,
    onPrimary = TextLight,
    onSecondary = TextLight,
    onBackground = TextLight,
    onSurface = TextLight,
    onPrimaryContainer = AmoledBlack
)

@Composable
fun StoryFlowTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography,
        content = content
    )
}

