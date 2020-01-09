public final class GrowingPlant {

	int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
		int count = 0, height = 0;
		while(true) {
			height += upSpeed;
			count++;
			if(height >= desiredHeight) { break; }
			height -= downSpeed;
		}
		return count;
	}
}