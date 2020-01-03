public class AdjacentElementsProduct {
	
	int adjacentElementsProduct(int[] inputArray) {
	    int[] newArr = new int[inputArray.length];
	    int count = inputArray.length - 1;
	    for (int i = 0; i < count; i++){
	        newArr[i] = inputArray[i] * inputArray[i + 1];
	    }
	    int max = newArr[0];
	    for (int e = 0; e < count; e++){
	        max = (newArr[e] > max) ? newArr[e] : max;
	    }
	    return max;
	}
}