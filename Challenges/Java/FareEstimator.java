import java.util.stream.IntStream;

final class FareEstimator {

	double[] fareEstimator(int ride_time, int ride_distance, double[] cost_per_minute, double[] cost_per_mile) {
    
	    return IntStream.range(0, cost_per_mile.length)
	    .mapToDouble(i -> cost_per_minute[i] * ride_time + cost_per_mile[i] * ride_distance)
	    .toArray();
	}
}