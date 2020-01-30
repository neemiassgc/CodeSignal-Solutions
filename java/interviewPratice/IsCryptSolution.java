public final class IsCryptSolution {

    boolean isCryptSolution(String[] crypt, char[][] solution) {
        String reg = "0+\\d+";
        for(char[] x : solution) {
            for(int i = 0; i < 3; i++) {
                if(crypt[i].contains(x[0]+"")) {
                    crypt[i] = crypt[i].replace(x[0]+"", x[1]+"");
                }
            }
        }
        if(crypt[0].matches(reg) || crypt[1].matches(reg)
            || crypt[2].matches(reg)) { return false; }
        return (Double.valueOf(crypt[0]) + Double.valueOf(crypt[1])
            == Double.valueOf(crypt[2]));
    }
}