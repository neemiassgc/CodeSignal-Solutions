public final class FileNaming {

	String[] fileNaming(String[] names) {
	    List<String> list = new ArrayList();
	    for(int i = 0; i < names.length; i++) {
	        if(!list.contains(names[i])) {
	        	list.add(names[i]);
	        	continue;
	        }
	        String s = names[i];
            for(int n = 1; list.contains(s); n++) {
                s = names[i]+"("+n+")";
            }
            list.add(s);
	    }
	    return list.toArray(new String[list.size()]);
	}
}