data class Albatross(
    val color: String = "black_and_white",
    override val size: Int = 115,
    override val moving_method: String = "fly",
    override val active_at: String = "daylight"
)
    : Bird(moving_method, active_at, size)