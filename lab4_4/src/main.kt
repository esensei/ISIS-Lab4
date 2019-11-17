import java.time.LocalDateTime

fun main() {
    val m1 = Meeting()
    printAll(m1)

    val m2 = Meeting(place = "Конференц зал")
    printAll(m2)

    val m3 = Meeting(
        place = "Новогодняя ёлка",
        dateTime = LocalDateTime.of(2019, 12, 31, 21, 0),
        members = listOf("Дед мороз", "Снегурочка", "Снеговик"))

    printAll(m3)
}

fun printAll(meeting: Meeting) {
    println(meeting.dateTime)
    println(meeting.members)
    println(meeting.place)
    println()
}