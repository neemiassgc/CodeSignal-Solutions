fun isSmooth(arr: MutableList<Int>): Boolean {
    val l: Int = arr.size
    
    if (l == 1) return true
    
    var middle: Int = when (l % 2) {
        0 -> arr[l / 2] + arr[l / 2 - 1]
        else -> arr[l / 2]
    }
    
    return arr[0] == middle && arr.last() == middle
}