fun main(args: Array<String>) {
    val Albert = Albatross(size = 120);
    val Ross = Albatross(size = 40)
    val Vasya = Kiwi(size = 60)
    val Kolyan = Kiwi(size = 15)
    println(Albert.relative_size(90))
    println(Ross.relative_size(1))
    println(Vasya.relative_size(4))
    println(Kolyan.relative_size(2))
}