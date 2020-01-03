public class AreSimilar {

	boolean areSimilar(int[] a, int[] b) {
		int c = 0, n1 = 0, n2 = 0, nn1 = 0, nn2 = 0;
		for(int i = 0; i < a.length; i++) {
	        if(a[i] != b[i]) {
	            if(c == 0) {
	                n1 = a[i];
	                n2 = b[i];
	            }
	            else if(c == 1) {
	                nn1 = b[i];
	                nn2 = a[i];
	            }
	            c++;
	        }
		}
	    return (n1 == nn1 && n2 == nn2 && c <= 2);
	}    
}

