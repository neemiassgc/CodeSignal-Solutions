public final class AreEquallyStrong {

	boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    	int yl = yourLeft, yr = yourRight, fl = friendsLeft, fr = friendsRight;
   		return (yl == fl && yr == fr || yr == fl && yl == fr);
	}
}