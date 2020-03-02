public final class DifferentSquares {

	int differentSquares(int[][] matrix) {
	    int h = matrix.length, w = matrix[0].length;
	    ArrayList<String> sums = new ArrayList();
	    String s = "";
	    for(int i = 1; i < h; i++) {
	        for(int j = 1; j < w; j++, s = "") {
	            s += ""+matrix[i][j]+matrix[i][j - 1]+
	                    matrix[i - 1][j - 1]+matrix[i - 1][j];
	            if(!sums.contains(s)) { sums.add(s); }
	        }
	    }
	    return sums.size();
	}
}