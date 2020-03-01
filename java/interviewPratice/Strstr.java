final class Strstr {

	int strstr(String s, String x) {
	    int d = 256, m = x.length(), n = s.length(), q = 7;
	    int p = 0, t = 0, h = 1;
			
			for(int i = 0; i < m - 1; i++) {
				h = (h * d) % q;
			}

			for(int i = 0; i < m; i++) {
				p = (p * d + x.charAt(i)) % q;
				t = (t * d + s.charAt(i)) % q;
			}

			for(int i = 0, j = 0; i <= n - m; i++) {
				if(p == t) {
					for(j = 0; j < m; j++) {
						if(s.charAt(i + j) != x.charAt(j)) {
							break;
						}
					}

					if (j == m) {
	                	return i; 
					}

				}

				if(i < n - m) {
					t = ( d * (t - s.charAt(i) * h) + s.charAt(i + m)) % q;

					if(t < 0) {
						t = (t + q);
					} 
				}
			}

	    return -1;
	}
}