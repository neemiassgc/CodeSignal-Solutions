public final class LineEnconding {

	String lineEncoding(String s) {
	    String str = "", res = "";
	    ArrayList<String> list = new ArrayList();
	    for(int i = 0; i < s.length(); i++) {
	        if(i == 0) { str += s.charAt(i)+""; }
	        else if(s.charAt(i) == s.charAt(i - 1)) { str += s.charAt(i)+""; }
	        else {
	            list.add(str);
	            str = s.charAt(i)+"";
	        }
	        if(i + 1 == s.length()) { list.add(str); }
	    }
	    for(int i = 0; i < list.size(); i++) {
	        int len = list.get(i).length(); 
	        if(len > 1) { res += len+""+list.get(i).charAt(0); }
	        else { res += list.get(i).charAt(0)+""; }
	    }
	    return res;
	}
}