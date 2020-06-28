final class CountClouds {
	
	int n, m;

	void checker(char sky[][], int i, int j) {
	    sky[i][j] = '*';

	    if(j + 1 < m && sky[i][j + 1] == '1') checker(sky, i, j + 1);
	    
	    if(i + 1 < n && sky[i + 1][j] == '1') checker(sky, i + 1, j);
	    
	    if(j - 1 >= 0 && sky[i][j - 1] == '1') checker(sky, i, j - 1);
	    
	    if(i - 1 >= 0 && sky[i - 1][j] == '1') checker(sky, i - 1, j);
	}

	int countClouds(char[][] skyMap) {
	    int u = 0;
	    n = skyMap.length;
	    m = n > 0 ? skyMap[0].length : 0;
	    
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < m; j++) {
	            if(skyMap[i][j] == '1') {
	                checker(skyMap, i, j);
	                u++;
	            }
	        }
	    }
	    
	    return u;
	}
}