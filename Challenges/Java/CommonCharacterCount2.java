public final class CommonCharacterCount2 {
    
    int commonCharacterCount2(String[] s) {
        int output = 0;
        Set<Character> set = new HashSet<>();

        for(int i = 97, k = 0; i <= 122; i++, k = 0) {
            for(String str : s) {
                if(!str.contains(((char)i)+"")) {
                    k++;
                    break;
                }
            }
            if(k == 0) {
                set.add((char)i);
            }
        }

        for(char x : set) {
            int min = 0;
            for(String str : s) {
                int count = 0;
                for(char y : str.toCharArray()) {
                    if(x == y) {
                        count++;
                    }
                }
                min = count < min ? count : min == 0 ? count : min;
            }
            output += min;
        }
        return output;
    }

}