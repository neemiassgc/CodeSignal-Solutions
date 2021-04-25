fun countSumOfTwoRepresentations2(n: Int, l: Int, r: Int): Int {
    if (2 * r < n || 2 * l > n) return 0;
    val min: Double = Math.max(l.toDouble(), n.toDouble() - r.toDouble());
    val max: Double = Math.min(r.toDouble(), n.toDouble() - l.toDouble());
    return ((Math.floor((max + min) / 2.0) - min) + 1.0).toInt();
}