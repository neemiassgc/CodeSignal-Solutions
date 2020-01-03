import java.util.Arrays;

public final class AvoidObstacles {

	int avoidObstacles(int[] inputArray) {
		boolean b = true;
	    for(int i = 2; true; i++) {
	        for(int f : inputArray) {
	        	if(f % i == 0) {
	        		b = !b;
	        		break;
	        	}
	        }
	        if(b) { return i; }
	        b = true;
	    }
    
	}
}