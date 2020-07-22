final class SpiralNumbers {

	int[][] spiralNumbers(int n) {
	    int[][] spiral = new int[n][n];
	    int left = 0, right = n - 1, top = 0, down = n - 1;
	    
	    for(int adder = 1; adder <= n * n; ) {
	        for(int x = left; x <= right; x++) spiral[top][x] = adder++;
	        top++;
	        
	        for(int y = top; y <= down; y++) spiral[y][right] = adder++;
	        right--;
	        
	        for(int x = right; x >= left; x--) spiral[down][x] = adder++;
	        down--;
	        
	        for(int y = down; y >= top; y--) spiral[y][left] = adder++;
	        left++;
	    }
	    
	    return spiral;
	}
	
}