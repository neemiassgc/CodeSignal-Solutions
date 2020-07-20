import java.util.stream.IntStream;
import java.util.stream.Collectors;

final class CommonCharacterCount {
	
	int commonCharacterCount(String s1, String s2) {
	    int o = 0;
	    String common = IntStream
	        .range(0x61, 0x7b)
	        .filter(n -> s1.contains((char)n+"") && s2.contains((char)n+""))
	        .boxed().map(c -> (char)c.intValue()+"").collect(Collectors.joining());
	    
	    for(char c : common.toCharArray()) {
	        o += Math.min(
	            s1.chars().map(n -> c == (char)n ? 1 : 0).sum(),
	            s2.chars().map(n -> c == (char)n ? 1 : 0).sum());
	    }
	    
	    return o;
	}
}