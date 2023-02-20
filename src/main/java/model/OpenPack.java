package model;

public class OpenPack {
    public static Player openPack(Player player, int tokenRequired){
        if(tokenRequired == 1) {
            return new PackSilver().addHeroesToDeck(player);
        }
        //new PackGold();
        return null;
    }
}
