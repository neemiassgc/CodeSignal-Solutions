public final class ReverseInteger {

    int reverseInteger(int x) {
        StringBuilder sb = new StringBuilder(Math.abs(x)+"");
        String out = sb.reverse().toString();
        return (x < 0) ? Integer.valueOf("-"+out) : Integer.valueOf(out);
    }
}