final class IsLucky {
	
	boolean isLucky(int n) {
	    String ticket = n+"";    
	    return ticket
	        .substring(0, ticket.length() / 2)
	        .chars().map(q -> new Integer((char)q+"")).sum() ==
	        ticket
	        .substring(ticket.length() / 2, ticket.length())
	        .chars().map(q -> new Integer((char)q+"")).sum();
	}
}