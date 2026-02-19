package MachineCoding.Cricinfo.entity;

import java.util.ArrayList;
import java.util.List;

public class Inning {
    private Team team;
    private int score;
    private int fallenWickets;
    private List<Over> overs;
    private Long inningId;
    private MatchResult result;

    public Inning(long id, Team team){
        this.inningId = id;
        this.team = team;
        overs = new ArrayList<>();
    }

    public Team getTeam() {
        return team;
    }

    public int getScore() {
        return score;
    }

    public int getFallenWickets() {
        return fallenWickets;
    }

    public List<Over> getOvers() {
        return this.overs;
    }

    public void addOver(Over over){
        this.overs.add(over);
    }

    public void wicketFall(){
        this.fallenWickets++;
    }

    public void incrementScore(int score){
        this.score+=score;
    }

    public MatchResult getResult() {
        return result;
    }

    public void setResult(MatchResult result) {
        this.result = result;
    }

    public int totalScore(){
        this.score = 0;
        for(Over over : overs){
            for(Ball ball : over.getBalls()){
                Result result1 = ball.getResult();
                score += (result1.getExtras() + result1.getValue());
            }
        }
        return score;
    }
}
