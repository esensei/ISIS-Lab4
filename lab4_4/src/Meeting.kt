import java.time.LocalDateTime
import java.util.*

class Meeting(
    dateTime: LocalDateTime = LocalDateTime.of(2019, 11, 20, 14, 0),
    place: String = "зал заседаний",
    val members: List<String> = listOf()
) : Event(dateTime, place)