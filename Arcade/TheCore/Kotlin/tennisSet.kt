fun tennisSet(score1: Int, score2: Int) =
    if (score1 > score2) {
        (score1 == 7 && (score2 == 5 || score2 == 6)) ||
            (score1 == 6 && (score2 < 5 && score2 >= 0))
    }
    else (score2 == 7 && (score1 == 5 || score1 == 6)) ||
        (score2 == 6 && (score1 < 5 && score1 >= 0))
