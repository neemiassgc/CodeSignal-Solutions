final class ValidTime {

	boolean validTime(String time) {
	    String[] dig = time.split(":");
	    return new Integer(dig[0]) < 24 && new Integer(dig[1]) < 60;
	}
}