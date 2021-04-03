fun phoneCall(min1: Int, min2_10: Int, min11: Int, s: Int): Int {
    var min: Int = 0
    var q: Int = 9
    var p: Int = s
        
    if (p >= min1) {
        p -= min1;
        min++;
    }
    
    (1..9).forEach {
        if (p >= min2_10) {
            p -= min2_10;
            min++;
            q--;
        }
    }
    
    if(q == 0) {
        while(p >= min11) {
            p -= min11;
            min++;
        }   
    }
    
    return min; 
}