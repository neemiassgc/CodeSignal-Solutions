fun increaseNumberRoundness(n: Int) =
    Regex("0[1-9]").containsMatchIn(n.toString());