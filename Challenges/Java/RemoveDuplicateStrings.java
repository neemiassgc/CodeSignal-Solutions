public final class RemoveDuplicateStrings {

	String[] removeDuplicateStrings(String[] inputArray) {
	    ArrayList<String> list = new ArrayList();
	    for(String s : inputArray) {
	        if(!list.contains(s)) { list.add(s); }
	    }
	    return list.toArray(new String[list.size()]);
	}
}