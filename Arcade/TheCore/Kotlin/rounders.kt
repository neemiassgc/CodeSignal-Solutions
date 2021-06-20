fun rounders(n: Int): Int {
    val s: String = n.toString();
    val digits: IntArray = IntArray(s.length) { Integer.parseInt(s[it].toString()) }

    (digits.size - 1 downTo 1).forEach {
        if (digits[it] >= 5) digits[it - 1]++;
        digits[it] = 0;
    }

    return Integer.parseInt(digits.joinToString(""));
}