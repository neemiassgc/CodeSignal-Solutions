final class RotateImage {

	int[][] rotateImage(int[][] a) {
	    int lh = a.length, lw = a[0].length;
	    int[][] out = new int[lh][lw];
	    
	    for(int i = 0, x = 0; i < lw; i++, x++) {
	        for(int j = lh - 1, y = 0; j >= 0; j--, y++) {
	            out[i][j] = a[y][x];
	        }   
	    }
	    
	    return out;
	}
}