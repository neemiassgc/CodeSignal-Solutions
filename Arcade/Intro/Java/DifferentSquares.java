import java.util.Set;
import java.util.HashSet;

final class DifferentSquares {

	int differentSquares(int[][] matrix) {
	    Set<String> set = new HashSet<>();
	    
	    for(int x = 0; x < matrix.length - 1; x++) {
	        for(int y = 0; y < matrix[0].length - 1; y++) {
	            String aux = "";
	            for(int i = x; i < x + 2; i++)
	                for(int j = y; j < y + 2; j++) aux += matrix[i][j];
	            set.add(aux);
	        }
	    }
	    
	    return set.size();
	}
}