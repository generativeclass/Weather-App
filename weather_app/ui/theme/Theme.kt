package com.example.weather_app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = Teal200,
    secondary = Teal500,
    background = Black,
    surface = DeepPurple500,
    onPrimary = Black,
    onSecondary = Black,
    onBackground = DeepPurple200,
    onSurface = DeepPurple200
)

private val LightColorScheme = lightColorScheme(
    primary = Teal500,
    secondary = Teal700,
    background = Black,
    surface = DeepPurple500,
    onPrimary = Black,
    onSecondary = Black,
    onBackground = DeepPurple200,
    onSurface = DeepPurple200
)

@Composable
fun Weather_appTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}
