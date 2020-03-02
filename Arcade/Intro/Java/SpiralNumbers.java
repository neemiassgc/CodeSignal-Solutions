public final class SpiralNumbers {

	int[][] spiralNumbers(int n) {
	    int[][] spiral = new int[n][n];
	    int k = 1, x = -1, y = 0;
	    for(int i = 1; i <= n * n; i++) {
	        switch(k) {
	        case 1:
	            x++;
	            if(spiral[y][x] == 0) { spiral[y][x] = i; }
	            else { x--; k = 2; i--; }
	            if(x == n - 1) { k = 2; }
	            break;
	        case 2:
	            y++;
	            if(spiral[y][x] == 0) { spiral[y][x] = i; }
	            else { y--; k = 3; i--; }
	            if(y == n - 1) { k = 3; }
	            break;
	        case 3:
	            x--;
	            if(spiral[y][x] == 0) { spiral[y][x] = i; }
	            else { x++; k = 4; i--; }
	            if(x == 0) { k = 4; }
	            break;
	        case 4:
	            y--;
	            if(spiral[y][x] == 0) { spiral[y][x] = i; }
	            else { y++; k = 1; i--; }
	            if(y == 0) { k = 1; }
	            break;    
	        }
	    }
	    return spiral;
	}
}