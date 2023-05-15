package kgb.plum.myapplication.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import kgb.plum.myapplication.R

private val spoqaBold = FontFamily(
    Font (R.font.spoqa_han_snas_neo_bold, FontWeight.Bold)
)
private val spoqaMedium = FontFamily(
    Font(R.font.spoqa_hans_sans_neo_medium, FontWeight.Medium)
)
private val spoqaRegular = FontFamily(
    Font(R.font.spoqa_hans_sans_neo_regular, FontWeight.Normal)
)
private val spoqaLight = FontFamily(
    Font(R.font.spoqa_hans_sans_neo_light, FontWeight.Light)
)
private val spoqaThin = FontFamily(
    Font(R.font.spoqa_hans_sans_neo_thin, FontWeight.Thin)
)

val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 60.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 32.sp,
    ),
    headlineSmall = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 24.sp
    ),
    displayMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 18.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 18.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 15.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp
    )
)

val Typography.headLargeThin: TextStyle
    @Composable get() = headlineLarge.copy(
        fontFamily = spoqaThin
    )

val Typography.button: TextStyle
    @Composable get() = displayMedium.copy(
        fontFamily = spoqaMedium
    )

val Typography.underlineLabel: TextStyle
    @Composable get() = labelSmall.copy(
        fontSize = 18.sp,
        textDecoration = TextDecoration.Underline
    )