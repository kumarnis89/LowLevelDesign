package MachineCoding.Cricinfo.entity;

import java.util.ArrayList;
import java.util.List;

public class Over {
    List<Ball> balls;
    private int overNumber;

    public Over(int overNumber){
        this.overNumber = overNumber;
        balls = new ArrayList<>();
    }

    public void addBall(Ball ball){
        balls.add(ball);
    }

    public List<Ball> getBalls(){
        return balls;
    }

    public int getOverNumber() {
        return overNumber;
    }
}
