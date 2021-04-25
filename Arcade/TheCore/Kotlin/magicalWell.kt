fun magicalWell(a: Int, b: Int, n: Int): Int =
    if (n == 0) 0 else a * b + magicalWell(a + 1, b + 1, n - 1)