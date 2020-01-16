public final class TriangleExistence {

	boolean triangleExistence(int[] sides) {
	    int s1 = sides[0] + sides[1];
	    int s2 = sides[1] + sides[2];
	    int s3 = sides[0] + sides[2];
	    return (s1 > sides[2] && s2 > sides[0] && s3 > sides[1]);
	}
}