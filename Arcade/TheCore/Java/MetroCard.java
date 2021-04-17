final class MetroCard {
	
	int[] metroCard(int lastNumberOfDays) {
	    return lastNumberOfDays == 31 ? new int[]{28, 30, 31} : new int[]{31}; 
	}
}