final class LineUp {
    
    int lineUp(String commands) {
        int count = 0;
        int smartStudent = 0;
        int dumbStudent = 0;
        
        for (char c : commands.toCharArray()) {
            switch (c) {
                case 'L', 'R' -> {
                    smartStudent++;
                    dumbStudent--;    
                }
                case 'A' -> {
                    smartStudent = smartStudent + 2;
                    dumbStudent = dumbStudent + 2;
                }
            }
                
            smartStudent = smartStudent < 0 ? smartStudent + 4 : smartStudent % 4;
            dumbStudent = dumbStudent < 0 ? dumbStudent + 4 : dumbStudent % 4;
            if (smartStudent == dumbStudent) count++;
        }
        
        return count;
    }
}