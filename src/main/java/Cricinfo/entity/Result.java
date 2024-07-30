package Cricinfo.entity;

public enum Result {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    WICKET(0),
    NOBALL(1),
    DEADBALL(0),
    FREEHIT(0),
    WIDE(1),
    BYE(0),
    LEGBYE(0),
    OVERTHROWS(0),
    PENALTYRUNS(0);

    private int value;
    private int extras;

    Result(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }
}
