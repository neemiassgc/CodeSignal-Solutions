final class IsMAC48Adress {

	boolean isMAC48Address(String inputString) {
	    return inputString.matches("[0-9A-F]{2}(-[0-9A-F]{2}){5}");
	}
}