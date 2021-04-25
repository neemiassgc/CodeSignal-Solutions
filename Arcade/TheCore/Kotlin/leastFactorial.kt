fun fact(n: Int): Int = if (n == 1) n else n * fact(n - 1)

fun leastFactorial(n: Int): Int {
    var i: Int = 1
    while(true) {
        val f: Int = fact(i)
        if (f >= n) return f
        i++
    }
}