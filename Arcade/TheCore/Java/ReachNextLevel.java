final class ReachNextLevel {

	boolean reachNextLevel(int experience, int threshold, int reward) {
    	return reward + experience >= threshold;
	}
}