fun lateRide(n: Int) =
    "${n / 60}${n % 60}".sumBy { it.toString().toInt() }
