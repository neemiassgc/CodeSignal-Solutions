final class LateRide {

	int lateRide(int n) {
	    return ((n / 60)+""+(n % 60)).chars()
	    .map(e -> Integer.parseInt((char)e+"")).sum();
	}
}