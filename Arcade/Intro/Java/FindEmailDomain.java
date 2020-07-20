final class FindEmailDomain {

	String findEmailDomain(String address) {
		String[] pieces = address.split("@");
		return pieces[pieces.length - 1];
	}
}