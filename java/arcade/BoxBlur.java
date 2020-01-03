import java.util.Arrays;

public final class BoxBlur {

	int[][] boxBlur(int[][] image) {
	    int h = image.length - 2;
	    int w = image[0].length - 2;
	    int[][] sum = new int[h][w];
	    for(int i = 1; i <= h; i++) {
	        for(int j = 1; j <= w; j++) {
	            int c =
	                image[i - 1][j - 1] + image[i - 1][j] + image[i - 1][j + 1]+
	                image[i][j - 1] + image[i][j] + image[i][j + 1]+
	                image[i + 1][j - 1] + image[i + 1][j] + image[i + 1][j + 1];
	            sum[i - 1][j - 1] = c / 9;
	        }
	    }
	    return sum;
	}
}