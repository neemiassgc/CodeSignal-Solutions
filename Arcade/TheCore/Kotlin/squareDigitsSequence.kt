fun squareDigitsSequence(a0: Int): Int {
    val seq: MutableList<Int> = mutableListOf(a0);
    
    while (true) {
        val sum: Int = (""+seq[0])
            .map { Math.pow((""+it).toInt().toDouble(), 2.0) }
            .sumOf { it.toInt() }
            
        if (sum in seq) break;        
        
        seq.add(0, sum);
    }
    
    return seq.size + 1;
}