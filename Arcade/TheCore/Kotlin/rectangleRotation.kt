fun solution(a: Int, b: Int): Int {
    val aBisect: Double = (a / Math.sqrt(2.0)) / 2
    val bBisect: Double = (b / Math.sqrt(2.0)) / 2

    val rect1: Array<Int> = arrayOf(
        Math.floor(aBisect).toInt() * 2 + 1,
        Math.floor(bBisect).toInt() * 2 + 1
    )
    
    val rect2: Array<Int> = arrayOf(
        if (aBisect - Math.floor(aBisect) < 0.5) rect1[0] - 1 else rect1[0] + 1,
        if (bBisect - Math.floor(bBisect) < 0.5) rect1[1] - 1 else rect1[1] + 1
    )
    
    return rect1[0] * rect1[1] + rect2[0] * rect2[1]
}