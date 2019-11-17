open class Rectangle(open val length: Int, open val width: Int) {
    open fun area(): Int {
        return length * width
    }

}