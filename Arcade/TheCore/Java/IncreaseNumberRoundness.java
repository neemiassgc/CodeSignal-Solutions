final class IncreaseNumberRoundness {

    boolean increaseNumberRoundness(int n) {
        return (n+"").matches(".*0[1-9].*");
    }
}