final class IsSumOfConsecutive2 {
	
	int isSumOfConsecutive2(int n) {
	    int ways = 0;
	    
	    for (int i = 1; i <= n; i++) {
	        int sum = i;
	        
	        for (int j = i + 1; j < n; j++) {
	            if ((sum += j) > n) break;
	            else if (sum == n) ways++;
	        }
	    }
	    
	    return ways;
	}
}