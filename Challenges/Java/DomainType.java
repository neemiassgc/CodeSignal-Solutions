final class DomainType {
	
	String[] domainType(String[] domains) {
	    Map<String, String> dMap = new HashMap<>() {
	        {
	            put("com", "commercial");
	            put("org", "organization");
	            put("net", "network");
	            put("info", "information");
	        }
	    };
	    
	    return Stream.<String>of(domains).map(e -> {
	        Matcher m =  Pattern.compile("(?<=\\.)[a-z]+$").matcher(e);
	        return m.find() ? m.group() : "";
	    })
	    .map(e -> dMap.get(e))
	    .toArray(String[]::new);
	}
}