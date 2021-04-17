fun isInfiniteProcess(a: Int, b: Int) =
    !((a < b && Math.abs(a - b) % 2 == 0) || a == b);