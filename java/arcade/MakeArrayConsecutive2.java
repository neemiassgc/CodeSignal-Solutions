import java.util.Arrays;

public class MakeArrayConsecutive2 {

	int makeArrayConsecutive2(int[] statues) {
	    Arrays.sort(statues);
		int min = statues[0];
		int max = statues[statues.length - 1];
		int count = 0;
		boolean b = false;
		for(int i = min; i < max; i++){
		    for(int j : statues) {
		        if(j == i) {
		            b = !b;
		            break;
		        }
		    }
		    count += (!b) ? 1 : 0;
		    b = false;
		}
		return count;
	}
}