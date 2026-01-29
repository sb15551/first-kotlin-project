package ru.behavior.lesson_2

import ru.behavior.lesson_1.SECONDS_TO_MINUTE

fun main() {

    val hour: Int = 9
    val minute: Int = 39
    val travelTime: Int = 457

    val resultMinutes: Int = hour * SECONDS_TO_MINUTE + minute + travelTime;
    val travelHour: Int = resultMinutes / SECONDS_TO_MINUTE
    val travelMinute: Int = resultMinutes % SECONDS_TO_MINUTE

    println("%02d:%02d".format(travelHour, travelMinute))

}