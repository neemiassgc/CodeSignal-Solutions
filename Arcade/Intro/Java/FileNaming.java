import java.util.Vector;

final class FileNaming {

	String[] fileNaming(String[] names) {
	    Vector<String> vector = new Vector<>();
	    
	    for(int i = 0; i < names.length; i++) {
	        String aux = names[i];
	        for(int k = 1; vector.contains(aux); k++) aux = names[i]+"("+k+")";
	        vector.add(aux);
	        names[i] = aux;
	    }
	    
	    return names;
	}
}