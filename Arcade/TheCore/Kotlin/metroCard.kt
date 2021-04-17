fun metroCard(lastNumberOfDays: Int) =
    if (lastNumberOfDays == 31) mutableListOf(28, 30, 31)
    else mutableListOf(31)