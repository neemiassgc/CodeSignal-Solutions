import java.util.Arrays;

final class BoxBlur {

	int[][] boxBlur(int[][] image) {
	    int h = image.length - 2;
	    int w = image[0].length - 2;
	    int[][] sum = new int[h][w];
	    
	    for(int i = 0; i < h; i++) {
	        for(int j = 0; j < w; j++) {
	            for(int y = i; y < i + 3; y++)
	                for(int x = j; x < j + 3; x++)
	                    sum[i][j] += image[y][x];
	            
	            sum[i][j] /= 9;
	        }
	    }
	    
	    return sum;
	}
}