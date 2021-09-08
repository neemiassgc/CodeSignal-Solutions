fun gcd(a: Int, b: Int): Int {
    if (a == 0) return b;
    if (b == 0) return a;
    
    return if (a > b) gcd(a % b, b) else gcd(a, b % a);
}

fun countBlackCells(n: Int, m: Int): Int {
    if (n == m) return n + 2 * (n - 1);
    if (n == 1 || m == 1) return n * m;

    return n + m - gcd(n, m) + (gcd(n, m) - 1) * 2;
}