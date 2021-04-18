fun arrayPacking(a: MutableList<Int>): Int {
    return Integer.parseInt(
        a.map { it.toString(2) }
        .reversed()
        .joinToString(
            separator = "",
            transform = { "0".repeat(8 - it.length) + it }
        ), 2
    )
}