public final class CompanyBotStrategy {
	
	double companyBotStrategy(int[][] trainingData) {
	    int q = 0;
	    double sum = 0d;
	    
	    for(int[] i : trainingData) {
	        if(i[1] == 1) {
	            q++;
	            sum += i[0];
	        }
	    }

	    return q > 0 ? sum / q : 0;
	}
}