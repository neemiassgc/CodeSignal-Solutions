fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
    val max: Int = statues.maxOf { it }
    val min: Int = statues.minOf { it }
    var additionalStatues = 0;
    
    (min..max).forEach({ statue ->
        if (!(statue in statues))
            additionalStatues++
    });
    
    return additionalStatues;
}