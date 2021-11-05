import java.util.stream.IntStream;
import java.util.function.IntUnaryOperator;

final class WeakNumbers {
    
    int[] weakNumbers(int n) {
        final IntUnaryOperator divisors = x ->
            (int) IntStream.rangeClosed(1, x).filter(i -> x % i == 0).count();
        
        final int[] weaknessSet =
            IntStream.rangeClosed(1, n).map(x -> {
                final int d = divisors.applyAsInt(x);
                
                return (int) IntStream.rangeClosed(1, x - 1)
                    .filter(i -> divisors.applyAsInt(i) > d).count();
            }).toArray();
            
        final int weakestNumber = IntStream.of(weaknessSet).max().getAsInt();
        
        return new int[] {
            weakestNumber,
            (int) IntStream.of(weaknessSet)
                .filter(it -> it == weakestNumber).count()
        };
    }
}