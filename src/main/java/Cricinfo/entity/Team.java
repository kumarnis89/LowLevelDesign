package Cricinfo.entity;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Team {
    List<Player> players;
    private String teamName;
    private Long teamId;

    public Team(Long id, String name){
        this.teamId = id;
        this.teamName = name;
        players = new ArrayList<>();
    }

    public void addplayer(Player player){
        players.add(player);
    }

    public List<Player> getPlayers(){
        return this.players;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
