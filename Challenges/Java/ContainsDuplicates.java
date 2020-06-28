final class ContainsDuplicates {

	boolean containsDuplicates(int[] a) {
	    return Arrays.stream(a).distinct().toArray().length != a.length;
	}
}