import database.InMemoryDatabasePlayer;
import domain.functional.model.Player;
import domain.functional.model.PlayerOpenPackService;
import domain.functional.service.HeroFinderService;
import domain.functional.service.PlayerCreateService;

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