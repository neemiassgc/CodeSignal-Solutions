fun appleBoxes(k: Int): Int {
    var redApples: Int = 0;
    var yellowApples: Int = 0;
    
    (1..k).forEach {
        if (it % 2 == 0) redApples += it * it;
        else yellowApples += it * it;
    }
    
    return redApples - yellowApples;
}