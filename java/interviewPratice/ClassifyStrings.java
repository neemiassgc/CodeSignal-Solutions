final class ClassifyStrings {

	String isGoodOrBad(String s) {
	    Pattern reg = Pattern.compile("[aeiou]{3}|[^aeiou]{5}");
	    return (reg.matcher(s).find() ? "bad" : "good");
	}

	String classifyStrings(String s) {
	    String s1 = null, s2 = null;

	    if(!s.contains("?")) {
	        return isGoodOrBad(s);
	    }
	    else {
	        s1 = isGoodOrBad(s.replace("?", "a"));
	        s2 = isGoodOrBad(s.replace("?", "n"));
	        if(s1.equals("bad") && s2.equals("bad") && !s.contains("???")) {
	            return "bad";
	        }
	        
	        if(s1.equals("good") && s2.equals("good") && !s.contains("???")) {
	            return "good";
	        }
	    }

	    return "mixed";
	}   
}