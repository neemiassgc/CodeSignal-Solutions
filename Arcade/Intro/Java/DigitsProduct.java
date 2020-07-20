final class DigitsProduct {

	int digitsProduct(int product) {
	    if(product == 0) return 10;
	    if(product < 10) return product;

	    String s = "";
	    for(int d = 9; d > 1; d--) for(; product % d == 0; product /= d) s = d+s;
	    return product == 1 ? Integer.parseInt(s) : -1;
	}
}