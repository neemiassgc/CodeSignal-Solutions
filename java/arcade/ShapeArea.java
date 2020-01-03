public class ShapeArea {

	int shapeArea(int n) {
	    int area = 1;
		for(int i = n; i > 1; i--) {
		    area += (i - 1) * 4;
		}
		return area;
	}
}