data class Square( val side: Int) : Rectangle(side, side) {
   override fun area(): Int {
       return 2 * side
   }
}