fun addTwoDigits(n: Int): Int {
  return n.toString().sumBy { it.toString().toInt() }
}