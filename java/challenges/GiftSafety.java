public final class GiftSafety {

	int giftSafety(String gift) {
	    int c = 0;
	    String[] perms = new String[gift.length() - 2];
	    for(int i = 0; i < perms.length; i++) {
	        String s = "";
	        for(int j = i; j < i + 3; j++) { s += gift.charAt(j)+""; }
	        perms[i] = s;
	    }
	    for(String str : perms) {
	        String s = "";
	        for(char ch : str.toCharArray()) {
	            if(!s.contains(ch+"")) { s += ch+""; }
	            else {
	                c++;
	                break;
	            }
	        }
	    }
	    return c;
	}
}