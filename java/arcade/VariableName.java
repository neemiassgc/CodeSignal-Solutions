public final class VariableName {

	boolean variableName(String name) {
	    Pattern p = Pattern.compile("[^\\s\\d]");
	    if(p.matcher(name.toCharArray()[0]+"").matches()) {
	        p = Pattern.compile("\\w*");
	        if(p.matcher(name).matches()) { return true; }
	    }
	    return false;
	}
}