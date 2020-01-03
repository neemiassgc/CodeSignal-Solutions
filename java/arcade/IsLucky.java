public class IsLucky {
	
	boolean isLucky(int n) {
		int h1 = 0, h2 = 0;
		char[] nn = (n+"").toCharArray();
		for(int i = 0; i < nn.length; i++) {
			if(i <= (nn.length - 1) / 2) {
				h1 += Integer.valueOf(nn[i]+"");
			}
			else {
				h2 += Integer.valueOf(nn[i]+"");
			}
		}
		return h1 == h2;
	}
}