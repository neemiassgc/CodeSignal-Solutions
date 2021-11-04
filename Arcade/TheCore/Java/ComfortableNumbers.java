import java.util.function.ToIntFunction;

final class ComfortableNumbers {
    
    int comfortableNumbers(int l, int r) {
        final ToIntFunction<String> s = n ->
            (n+"").chars().map(i -> Integer.parseInt((((char) i)+""))).sum();
        
        int pairs = 0;

        for (int i = l; i < r; i++)
            for (int j = i + 1; j <= r; j++)
                if (i >= j - s.applyAsInt(j+"")
                    && i <= j + s.applyAsInt(j+"")
                    && j >= i - s.applyAsInt(i+"")
                    && j <= i + s.applyAsInt(i+"")) pairs++;
        
        return pairs;
    }
}