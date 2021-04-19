fun rangeBitCount(a: Int, b: Int) = (a..b)
    .fold(0, {
        t, i -> Integer.toString(i, 2).replace("0", "").length + t
    })