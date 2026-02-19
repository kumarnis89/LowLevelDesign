package MachineCoding.Cricinfo;

import MachineCoding.Cricinfo.entity.*;

public class Application {
    public static void main(String[] args) {
        Player player1 = new Player(1L,"Player A1");
        player1.addRoleToPlayer(PlayerType.BATSMAN);
        player1.addRoleToPlayer(PlayerType.WICKETKEEPER);
        Player player2 = new Player(1L,"Player A2");
        player2.addRoleToPlayer(PlayerType.BATSMAN);
        Player player3 = new Player(1L,"Player A3");
        player3.addRoleToPlayer(PlayerType.ALLROUNDER);
        Player player4 = new Player(1L,"Player A4");
        player4.addRoleToPlayer(PlayerType.BOWLER);
        Player player5 = new Player(1L,"Player A5");
        player5.addRoleToPlayer(PlayerType.BOWLER);

        Player player6 = new Player(1L,"Player B1");
        player6.addRoleToPlayer(PlayerType.BATSMAN);
        Player player7 = new Player(1L,"Player B2");
        player7.addRoleToPlayer(PlayerType.BOWLER);
        Player player8 = new Player(1L,"Player B3");
        player8.addRoleToPlayer(PlayerType.BOWLER);
        Player player9 = new Player(1L,"Player B4");
        player9.addRoleToPlayer(PlayerType.ALLROUNDER);
        Player player10 = new Player(1L,"Player B5");
        player10.addRoleToPlayer(PlayerType.BATSMAN);
        player10.addRoleToPlayer(PlayerType.WICKETKEEPER);

        Team teamA = new Team(1L,"India");
        teamA.addplayer(player1);
        teamA.addplayer(player2);
        teamA.addplayer(player3);
        teamA.addplayer(player4);
        teamA.addplayer(player5);

        Team teamB = new Team(2L,"Pakistan");
        teamB.addplayer(player6);
        teamB.addplayer(player7);
        teamB.addplayer(player8);
        teamB.addplayer(player9);
        teamB.addplayer(player10);

        Inning firstInning = new Inning(1l,teamA);
        Over firstOver = new Over(1);
        Ball ball1 = new Ball(player7,player2,player1,false);
        ball1.setResult(Result.DOUBLE);
        Ball ball2 = new Ball(player7,player2,player1,false);
        ball2.setResult(Result.SINGLE);
        Ball ball3 = new Ball(player7,player1,player2,true);
        ball3.setResult(Result.WIDE);
        Ball ball4 = new Ball(player7,player1,player2,false);
        ball4.setResult(Result.BYE);
        ball4.getResult().setExtras(2);
        firstOver.addBall(ball1);
        firstOver.addBall(ball2);
        firstOver.addBall(ball3);
        firstOver.addBall(ball4);
        firstInning.addOver(firstOver);


        Inning secondInning = new Inning(2l,teamB);
        Over secondOver = new Over(1);
        Ball ball21 = new Ball(player4,player6,player10,false);
        ball21.setResult(Result.SINGLE);
        Ball ball22 = new Ball(player4,player10,player6,false);
        ball22.setResult(Result.SINGLE);
        Ball ball23 = new Ball(player4,player6,player10,false);
        ball23.setResult(Result.SIX);
        Ball ball24 = new Ball(player4,player6,player10,false);
        ball24.setResult(Result.BYE);
        ball24.getResult().setExtras(2);
        secondOver.addBall(ball21);
        secondOver.addBall(ball22);
        secondOver.addBall(ball23);
        secondOver.addBall(ball24);
        secondInning.addOver(secondOver);

        Match match = new Match(1);
        match.setFirstInning(firstInning);
        match.setSecondInning(secondInning);
        match.setInningAfterTossWin(1l);
        match.setVenue("Dharmshala, India");

        match.matchSummary();
    }
}
