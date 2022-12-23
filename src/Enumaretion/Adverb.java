package Enumaretion;

public enum Adverb {
    HERE,
    STRAIGHT,
    TROUGH,
    ASIF;

    @Override
    public String toString() {
        String res = switch (this) {
            case HERE:
                yield "тут";
            case STRAIGHT:
                yield "прямо";
            case TROUGH:
                yield "сквозь";
            case ASIF:
                yield "словно";
        };
        return res;
    }
}