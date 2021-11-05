fun comfortableNumbers(l: Int, r: Int): Int {
    fun Int.s(): Int = (""+this).sumOf { (""+it).toInt() };
    
    var pairs: Int = 0;
    
    (l..r).forEach { i -> 
        ((i + 1)..r).forEach { j -> 
            if (i in ((j - j.s())..(j + j.s()))
                && j in ((i - i.s())..(i + i.s()))) pairs++;
        }
    };
    
    return pairs;
}