public final class ElectionsWinners {

	int electionsWinners(int[] votes, int k) {
		int winners = 0, len = votes.length;
		boolean isWinning = true;
		for(int i = 0; i < len; i++, isWinning = true) {
			for(int j = 0; j < len; j++) {
				if(j != i && !(votes[i] + k > votes[j])) {
					isWinning = !isWinning;
					break;
				}
			}
			if(isWinning) { winners++; }
		}
		return winners;
	}
}