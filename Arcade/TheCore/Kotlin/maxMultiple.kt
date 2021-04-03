fun maxMultiple(divisor: Int, bound: Int): Int =
    if (bound % divisor == 0) bound
    else maxMultiple(divisor, bound - 1)
