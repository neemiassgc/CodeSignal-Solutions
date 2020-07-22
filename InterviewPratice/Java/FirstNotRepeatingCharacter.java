final class FirstNotRepeatingCharacter {

	char firstNotRepeatingCharacter(String s) {
	    int[] a = new int[26];
	    
	    for(char c : s.toCharArray()) a[c - 'a']++;
	    
	    for(char c : s.toCharArray()) if(a[c - 'a'] == 1) return c;
	    
	    return '_';
	}
}