fun lineUp(commands: String): Int {
    var count: Int = 0;
    var smartStudent: Int = 0;
    var dumbStudent: Int = 0;
    
    commands.forEach {
        when (it) {
            'L', 'R' -> {
                smartStudent++;
                dumbStudent--;
            }
            'A' -> {
                smartStudent = smartStudent + 2;
                dumbStudent = dumbStudent + 2;
            }
        }
        
        smartStudent =
            if (smartStudent < 0) smartStudent + 4
            else smartStudent % 4;
        dumbStudent =
            if (dumbStudent < 0) dumbStudent + 4
            else dumbStudent % 4;
            
        if (smartStudent == dumbStudent) count++;
    }
        
    return count;
}