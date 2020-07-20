final class IsIPv4Address {

	boolean isIPv4Address(String inputString) {
	    String[] split = inputString.split("\\.");
	    if(split.length != 4) return false;
	    for(String s : split) {
	        if(s.matches("\\d*[a-z]+\\d*") || s.length() == 0) return false;
	        if(s.length() > 1 && (s.charAt(0) == '0' || new Long(s) > 255)) {
	            return false;   
	        }
	    }
	    return true;
	}
}