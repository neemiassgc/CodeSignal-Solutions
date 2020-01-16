public final class ValidTime {

	boolean validTime(String time) {
	    String[] ptrs = time.split(":");
	    int hh = Integer.valueOf(ptrs[0]).intValue();
	    int mm = Integer.valueOf(ptrs[1]).intValue();
	    return (hh >= 0 && hh <= 23 && mm >= 0 && mm <= 59);
	}
}