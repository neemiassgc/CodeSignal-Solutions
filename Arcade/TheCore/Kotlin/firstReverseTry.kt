fun firstReverseTry(arr: MutableList<Int>): MutableList<Int> {
    fun <T> MutableList<T>.swp(i: Int, j: Int): Unit {
        val tmp: T = this[i];
        this[i] = this[j];
        this[j] = tmp;
    };
    
    if (arr.isNotEmpty()) arr.swp(0, arr.size - 1)
    
    return arr;
}