package MachineCoding.Cricinfo.entity;

public class Match {
    private Inning firstInning;
    private Inning secondInning;
    private long inningAfterTossWin;
    private long matchId;
    private String venue;

    public Match(long matchId) {
        this.matchId = matchId;
    }

    public Inning getFirstInning() {
        return firstInning;
    }

    public void setFirstInning(Inning firstInning) {
        this.firstInning = firstInning;
    }

    public Inning getSecondInning() {
        return secondInning;
    }

    public void setSecondInning(Inning secondInning) {
        this.secondInning = secondInning;
    }

    public long getInningAfterTossWin() {
        return inningAfterTossWin;
    }

    public void setInningAfterTossWin(long inningAfterTossWin) {
        this.inningAfterTossWin = inningAfterTossWin;
    }

    public long getMatchId() {
        return matchId;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void matchSummary(){
        System.out.println("First Inning :");
        System.out.println("Score : "+firstInning.totalScore()+"/"+firstInning.getFallenWickets());
        System.out.println("\nSecond Inning :");
        System.out.println("Score : "+secondInning.totalScore()+"/"+secondInning.getFallenWickets());

    }
}
