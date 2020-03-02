public final class MessageFromBinaryCode {

	String messageFromBinaryCode(String code) {
	    String bin = "", msg = "";
	    for(int i = 1; i <= code.length(); i++) {
	        bin += code.charAt(i - 1);
	        if(i % 8 == 0) {
	            msg += (char)Integer.parseInt(bin, 2);
	            bin = "";
	        }
	    }
	    return msg;
	}
}