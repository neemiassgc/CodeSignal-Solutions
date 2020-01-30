import java.util.ArrayList;

public final class NewRoadSystem {

    boolean newRoadSystem(boolean[][] roadRegister) {
        String l = "", r = "";
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < roadRegister.length; i++) {
            for(int j = 0; j < roadRegister[0].length; j++) {
                if(roadRegister[i][j]) { l += i;  r += j; }
            }
        }
        for(char c : l.toCharArray()) { sum1 += (byte)c; }
        for(char c : r.toCharArray()) { sum2 += (byte)c; }
        return sum1 == sum2;
    }
}