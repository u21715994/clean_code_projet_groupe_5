package domain.functional.model;

public class HistoryBattle {
    private Player attacker;
    private Player defender;
    private String battle;

    public HistoryBattle(Player attacker, Player defender){
        this.attacker = attacker;
        this.defender = defender;
    }

    public String battleLog(){
        this.battle = "Le joueur " + this.attacker.getName() +
                " a attaque le joueur " + this.defender.getName();
        return battle;
    }
}
