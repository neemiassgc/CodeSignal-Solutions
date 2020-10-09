import java.util.*;
import java.util.stream.*;


final class CatalogUpdate {

	String[][] catalogUpdate(String[][] catalog, String[][] updates) {
	    List<List<String>> out = new Vector<>();
	    Map<String, Vector<String>> category = new HashMap<>();
	    
	    for(int i = 0; i < catalog.length; i++)
	        category.put(catalog[i][0], new Vector<>());
	    
	    for(int i = 0; i < catalog.length; i++) {
	        for(int j = 1; j < catalog[i].length; j++)
	            category.get(catalog[i][0]).add(catalog[i][j]);
	    }
	    
	    for(int i = 0; i < updates.length; i++) {
	        if(category.containsKey(updates[i][0])) {
	            for(int j = 1; j < updates[i].length; j++)
	                category.get(updates[i][0]).add(updates[i][j]);
	            continue;
	        }
	        category.put(updates[i][0], new Vector<>());
	        for(int j = 1; j < updates[i].length; j++)
	            category.get(updates[i][0]).add(updates[i][j]);
	    }
	    
	    int index = 0;
	    for(Map.Entry<String, Vector<String>> me : category.entrySet()) {
	        out.add(new Vector<>());
	        out.get(index).add(me.getKey());
	        for(String s : me.getValue().stream().sorted().toArray(String[]::new))
	            out.get(index).add(s);
	        index++;
	    }
	    
	    return out.stream().map(e -> e.toArray(String[]::new))
	    .sorted( (a, b) -> a[0].compareTo(b[0])).toArray(String[][]::new);
	}
}