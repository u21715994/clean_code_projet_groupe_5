package domain.functional.model;

import domain.functional.service.UpdatePlayerInDatabaseService;

public class PlayerOpenPackService {
    public static Player openPack(Player player, int tokenRequired){
        if(tokenRequired == 1) {
            player = new PackSilver().addHeroesToDeck(player);
            UpdatePlayerInDatabaseService.updatePlayer(player.getID(), player);
            return player;
        }
        //new PackGold();
        return null;
    }
}
