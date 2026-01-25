package ru.behavior.lesson_1

val SECONDS_TO_HOUR: Int = 3600
val SECONDS_TO_MINUTE: Int = 60

fun main() {

    var secondsInSpace: Int = 6480
    var hours: Int = secondsInSpace / SECONDS_TO_HOUR
    var minutes: Int = (secondsInSpace % SECONDS_TO_HOUR) / SECONDS_TO_MINUTE
    secondsInSpace %= SECONDS_TO_MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, secondsInSpace))

}