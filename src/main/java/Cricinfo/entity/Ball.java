package Cricinfo.entity;

public class Ball {
    private Player bowler;
    private Player onStrikePlayer;
    private Player nonStrikePlayer;
    private Player wicketTakenBy;
    private Result result;
    private boolean isExtra;
    private String comment;

    public Ball(boolean isExtra){
        this.isExtra = isExtra;
    }

    public Ball(Player bowler, Player onStrikePlayer, Player nonStrikePlayer, boolean isExtra ){
        this.onStrikePlayer = onStrikePlayer;
        this.bowler = bowler;
        this.nonStrikePlayer = nonStrikePlayer;
        this.isExtra = isExtra;
    }

    public Player getWicketTakenBy() {
        return wicketTakenBy;
    }

    public void setWicketTakenBy(Player wicketTakenBy) {
        this.wicketTakenBy = wicketTakenBy;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
