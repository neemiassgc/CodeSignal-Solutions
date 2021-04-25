final class MagicalWell {
	
	int magicalWell(int a, int b, int n) {
	    int dolar = 0;
	    for (int i = 0; i < n; i++) dolar += a++ * b++;
	    return dolar;
	}
}