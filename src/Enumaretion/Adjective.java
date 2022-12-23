package Enumaretion;

public enum Adjective {
    SCARAY,
    EASY,
    PITCH,
    SOFT,
    BIG,
    INVISIBLE,
    HIS,
    WOODEN,
    DAILY,
    CLOTH,
    WHICH;

    @Override
    public String toString() {
        String res = switch (this) {
            case SCARAY:
                yield "страшный";
            case EASY:
                yield "легкое";
            case PITCH:
                yield "кромешная";
            case SOFT:
                yield "мягкое";
            case BIG:
                yield "большое";
            case INVISIBLE:
                yield "невидимого";
            case HIS:
                yield "свой";
            case WOODEN:
                yield "деревянный";
            case DAILY:
                yield "дневной";
            case CLOTH:
                yield "матерчатый";
            case WHICH:
                yield "которую";

        };
        return res;
    }
}
