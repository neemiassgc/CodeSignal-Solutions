final class Bomber {
    int deadEnemies(char[][] field, int x, int y) {
        int deads = 0;
        
        for(int j = x; j < field[0].length; j++) {
            if(field[y][j] == 'E') deads++;
            if(field[y][j] == 'W') break;
        }
        
        for(int j = y; j < field.length; j++) {
            if(field[j][x] == 'E') deads++;
            if(field[j][x] == 'W') break;
        }
        
        for(int j = x; j >= 0; j--) {
            if(field[y][j] == 'E') deads++;
            if(field[y][j] == 'W') break;
        }
        
        for(int j = y; j >= 0; j--) {
            if(field[j][x] == 'E') deads++;
            if(field[j][x] == 'W') break;
        }
        
        return deads;
    }

    int bomber(char[][] field) {
        int max = 0;
        
        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field[0].length; j++) {
                if(field[i][j] == '0') {
                    int tmp = deadEnemies(field, j, i);
                    if(tmp > max) max = tmp; 
                }
            }
        }
        
        return max;
    }
}