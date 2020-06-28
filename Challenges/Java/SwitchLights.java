final class SwitchLights {

	int[] switchLights(int[] a) {
	    for(int i = 0; i < a.length; i++) {
	        if(a[i] == 1) for(int j = 0; j <= i; j++) a[j] = a[j] == 0 ? 1 : 0;
	    }
	    return a;
	}
}