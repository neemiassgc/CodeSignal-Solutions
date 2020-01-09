public final class FindEmailDomain {

	String findEmailDomain(String address) {
	    String domain = "";
	    for(int i = address.length() - 1; i > 0; i--) {
	        if(address.charAt(i) != '@') { domain += address.charAt(i)+""; }
	        else { return new StringBuilder(domain).reverse().toString(); }
	    }
	    return "";
	}
}