open class Animal(open val size: Int) {
    open fun relative_size(normal_size: Int): Double {
        return size / normal_size / 0.01
    }
}