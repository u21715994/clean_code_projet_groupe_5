package model;

import model.Hero;

public class Player {
    private final String ID = "1";
    private final String name;
    private final long token;

    public Player(String name){
        this.name = name;
        this.token = 4;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Hero findHeroByID(String ID){
        //trouve hero grâce ID
        return new Hero();
    }

    public Hero findHeroByName(String name){
        //trouve hero grâce name
        return new Hero();
    }

    public void attackPlayer(Player player){
        //attaquer joueur
    }
}
