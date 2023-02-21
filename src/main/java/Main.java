import database.InMemoryDatabasePlayer;
import model.Player;
import model.PlayerOpenPackService;
import service.HeroFinderService;
import service.PlayerCreateService;
import service.PlayerFinderService;
import service.ShowDeckPlayerService;

import static database.InMemoryDatabasePlayer.IN_MEMORY_DATABASE;

public class Main {
    public static void main(String[] args) {
        Player player = PlayerCreateService.createPlayer("test");
        InMemoryDatabasePlayer.savePlayer(player);
        player = PlayerOpenPackService.openPack(player, 1);
        player = PlayerOpenPackService.openPack(player, 1);
        //ShowDeckPlayerService.showDeck(player);
        //System.out.println(PlayerFinderService.findPlayer(player.getID()));
        System.out.println(HeroFinderService.findHero(player.getDeck(), 1));
    }
}