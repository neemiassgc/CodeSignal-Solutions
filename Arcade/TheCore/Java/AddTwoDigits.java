final class AddTwoDigits {

	int addTwoDigits(int n) {
	    return (n+"").chars().map(e -> Integer.parseInt((char)e+"")).sum();
	}
}