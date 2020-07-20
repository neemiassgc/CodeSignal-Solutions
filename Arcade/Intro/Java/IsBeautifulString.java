final class IsBeautifulString {

	boolean isBeautifulString(String inputString) {
	    byte[] abc = new byte[26];
	    for(char c : inputString.toCharArray()) abc[c - 'a']++;
	    for(byte i = 0; i < 25; i++) if(abc[i + 1] > abc[i]) return false;
	    return true;
	}
}