import java.util.Arrays;

final class ElectionsWinners {

	int electionsWinners(int[] votes, int k) {
	    int winners = 0;
	    for(int i = 0; i < votes.length; i++) {
	        int v = votes[i];
	        votes[i] = 0;
	        if(Arrays.stream(votes).allMatch(e -> v + k > e)) winners++;
	        votes[i] = v;
	    }

	    return winners;
	}
}