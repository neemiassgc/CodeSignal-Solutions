import java.util.Arrays;

public final class FancyRide {
	
	String fancyRide(int l, double[] fares) {
	    String[] options = {"UberX", "UberXL", "UberPlus", "UberBlack", "UberSUV"};
	    int i = 0;
	    
	    Arrays.sort(fares);
	    
	    for(; i < fares.length; i++) if(fares[i] * l > 20) break;
	    
	    return options[i > 0 ? i - 1 : 0];
	}
}