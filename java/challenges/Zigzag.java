public class Zigzag {

	static int zigzag(int[] a) {
		if (a.length == 2) {
			return 1;
		}
		int back = 0;
		for (int i = 1; i < (a.length - 1); i++) {
			if ((a[i] > a[i+1]) && (a[i] > a[i-1])) {
				back++;
			} else if ((a[i] < a[i+1]) && (a[i] < a[i-1])) {
				back++;
			}
		}
		return back;
	}
}
