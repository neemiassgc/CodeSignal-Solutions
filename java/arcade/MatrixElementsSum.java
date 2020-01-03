public class MatrixElementsSum {
	
	int matrixElementsSum(int[][] matrix) {
		int sum = 0;
		for (int a = 0; a < matrix[0].length; a++) {
			for (int b = 0; b < matrix.length; b++) {
				if (matrix[b][a] == 0) { break; }
				else { sum += matrix[b][a]; }
			}
		}
		return sum;
	}
}