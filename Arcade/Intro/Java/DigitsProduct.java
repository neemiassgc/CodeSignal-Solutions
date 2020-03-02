public final class DigitsProduct {

	int digitsProduct(int product) {
	    if(product == 0) { return 10; }
	    else if(product == 1) { return 1; }
	    StringBuilder fct = new StringBuilder("");
	    int res = 0, work = product;
	    for(int i = 9; i > 1; i--) {
	        while(work % i == 0) {
	            work /= i;
	            fct.insert(0, i+"");
	        }
	    }
	    if(fct.length() > 0) {
	        res = Integer.valueOf(fct.toString());
	        if(res < product) { res = -1; }
	    }
	    else { res = -1; }
	    return res;
	}
}