final class IsCryptSolution {

    boolean isCryptSolution(String[] crypt, char[][] solution) {
        for(int i = 0; i < 3; i++)
            for(char[] c : solution) crypt[i] = crypt[i].replaceAll(c[0]+"", c[1]+"");

        for(String s : crypt) if(s.matches("0+\\d+")) return false;
        return Double.parseDouble(crypt[0]) + Double.parseDouble(crypt[1])
        == Double.parseDouble(crypt[2]);
    }
}