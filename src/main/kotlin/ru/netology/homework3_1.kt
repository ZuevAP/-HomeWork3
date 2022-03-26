package ru.netology

fun fotMinutes(seconds: Int): String {
    val minutes = seconds / 60
    return when (minutes) {
        in 0..1 -> "только что"
        21, 31, 41, 51 -> "минуту назад"
        2, 3, 4, 22, 23, 24, 32 -> "$minutes минуты назад"
        33, 34, 42, 43, 44, 52, 53, 54 -> "$minutes минуты назад"
        else -> "$minutes минут назад"
    }
}

fun forHours(seconds: Int): String {
    val hour = seconds / 3600
    return when (hour) {
        1, 21 -> "$hour час назад"
        2, 3, 4, 22, 23, 24 -> "$hour часа назад"
        else -> "$hour часов назад"
    }
}

fun forDays(seconds: Int): String {
    val hour = seconds / 3600
    return when (hour) {
        in 24..48 -> "сегодня"
        in 48..72 -> "вчера"
        else -> "давно"
    }
}


fun agoToText(seconds: Int) {
    when (seconds) {
        in 0..3600 -> println("Был(а) " + fotMinutes(seconds) + "")
        in 3601..86399 -> println("Был(а) " + forHours(seconds) + "")
        else -> println("Был(а) " + forDays(seconds) + "")
    }


}


fun main() {
    val seconds = 82800

    println(agoToText(seconds))
}