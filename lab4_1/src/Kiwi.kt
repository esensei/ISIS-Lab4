data class Kiwi(
    val color: String = "brown",
    override val size: Int = 40,
    override val moving_method: String = "walk",
    override val active_at: String = "daylight"
)
    : Bird(moving_method, active_at, size)