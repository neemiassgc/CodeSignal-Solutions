public final class TwoArraysNthElement {

	int twoArraysNthElement(int[] array1, int[] array2, int n) {
	    ArrayList<Integer> arr = new ArrayList();
	    for(int i : array1) { arr.add(i); }
	    for(int i : array2) { arr.add(i); }
	    Integer[] out = arr.toArray(new Integer[arr.size()]);
	    Arrays.sort(out);
	    return out[n];
	}
}