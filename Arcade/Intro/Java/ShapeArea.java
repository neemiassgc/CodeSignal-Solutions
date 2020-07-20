public class ShapeArea {

	int shapeArea(int n) {
	    return IntStream.range(0, n).map(p -> (p - n) * -1)
	        .map(q -> (q - 1) * 4).sum() + 1;
	}
}