final class SpiralNumbers {

	enum Way {
	    UP, DOWN, LEFT, RIGHT
	}

	int[][] spiralNumbers(int n) {
	    int[][] spiral = new int[n][n];
	    int x = -1, y = 0;
	    Way ways = Way.RIGHT;
	    
	    for(int i = 1; i <= n * n; i++) {
	        switch(ways) {
	            case RIGHT:
	                if(spiral[y][x + 1] == 0) spiral[y][x += 1] = i;
	                else {
	                    ways = Way.DOWN;
	                    i--;
	                }
	                if(x == n - 1) ways = Way.DOWN;
	                break;
	            case DOWN:
	                if(spiral[y + 1][x] == 0) spiral[y += 1][x] = i;
	                else {
	                    ways = Way.LEFT;
	                    i--;
	                }
	                if(y == n - 1) ways = Way.LEFT;
	                break;
	            case LEFT:
	                if(spiral[y][x - 1] == 0) spiral[y][x -= 1] = i;
	                else {
	                    ways = Way.UP;
	                    i--;
	                }
	                if(x == 0) ways = Way.UP;
	                break;
	            case UP:
	                if(spiral[y - 1][x] == 0) spiral[y -= 1][x] = i;
	                else {
	                    ways = Way.RIGHT;
	                    i--;
	                }
	                if(y == 0) ways = Way.RIGHT;
	                break;    
	        }
	    }
	    
	    return spiral;
	}
}