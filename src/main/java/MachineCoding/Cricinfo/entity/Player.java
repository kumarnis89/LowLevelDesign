package MachineCoding.Cricinfo.entity;

import java.util.ArrayList;
import java.util.List;

public class Player{
    private List<PlayerType> roles;
    private Long id;
    private String name;

    public Player(Long id, String name) {
        this.id = id;
        this.name = name;
        this.roles = new ArrayList<>();
    }

    public void addRoleToPlayer(PlayerType playerType){
        roles.add(playerType);
    }

    public List<PlayerType> getRoles(){
        return this.roles;
    }
}
