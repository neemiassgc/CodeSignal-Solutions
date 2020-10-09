import java.util.Map;
import java.util.HashMap;
import java.util.Vector;

final class LaunchSequenceChecker {
	
	boolean launchSequenceChecker(String[] systemNames, int[] stepNumbers) {
	    Map<String, Vector<Integer>> map = new HashMap<>();
	    
	    for(String s : systemNames) map.put(s, new Vector<>());

	    for(int i = 0; i < stepNumbers.length; i++)
	        map.get(systemNames[i]).add(stepNumbers[i]);
	        
	    for(Vector<Integer> v : map.values())
	        for(int i = 0; i < v.size() - 1; i++)
	            if(v.get(i) >= v.get(i + 1)) return false;
	    
	    return true;
	}
}