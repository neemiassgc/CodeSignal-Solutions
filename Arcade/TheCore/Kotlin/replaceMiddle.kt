fun replaceMiddle(arr: MutableList<Int>): MutableList<Int> {
    if (arr.size % 2 == 0) {
        val sum: Int = arr[arr.size / 2 - 1] + arr[arr.size / 2];
        
        arr[arr.size / 2 - 1] = sum;
        arr.removeAt(arr.size / 2);
    }
    
    return arr;
}