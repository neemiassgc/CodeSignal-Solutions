fun weakNumbers(n: Int): MutableList<Int> {
    fun Int.divisors(): Int = (1..this).count { this % it == 0 };
   
    fun Int.weakness(): Int {
        val d: Int = this.divisors();
        
        return (1..(this - 1)).count { d < it.divisors() }
    };
        
    val weaknessSet: List<Int> = (1..n).map { it.weakness() };
    
    val weakestNumber: Int = weaknessSet.maxOf { it.toDouble() }.toInt();
    
    return mutableListOf(
        weakestNumber,
        weaknessSet.count { it == weakestNumber }
    );
}