public class JumpingJimmy {

	int jumpingJimmy(int[] tower, int jumpHeight) {
		int back = 0;
		for (int i : tower) {
			if (jumpHeight >= i) {
				back += i;
				continue;
			}
			break;
		}
		return back;
	}
}