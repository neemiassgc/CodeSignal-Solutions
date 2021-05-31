final class AdditionWithoutCarrying {

    int additionWithoutCarrying(int param1, int param2) {
        String p1 = param1 + "";
        String p2 = param2 + "";
        final int len = Math.max(p1.length(), p2.length());
        String result = "";
        
        p1 = "0".repeat(len - p1.length()) + p1;
        p2 = "0".repeat(len - p2.length()) + p2;
        
        for (int i = len - 1; i >= 0; i--) {
            String aux = (
                Integer.parseInt(p1.charAt(i)+"") +
                Integer.parseInt(p2.charAt(i)+"")
            )+"";
            result = aux.charAt(aux.length() - 1) + result;
        } 
        
        return Integer.parseInt(result);
    }
}