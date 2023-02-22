import database.InMemoryDatabaseHistoryBattle;
import database.InMemoryDatabasePlayer;
import domain.functional.model.Player;
import domain.functional.model.PlayerOpenPackService;
import domain.functional.service.AttackPlayerService;
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
        //System.out.println(HeroFinderService.findHero(player.getDeck(), 1));

        Player player2 = PlayerCreateService.createPlayer("test2");
        InMemoryDatabasePlayer.savePlayer(player2);
        player2 = PlayerOpenPackService.openPack(player2, 1);
        player2 = PlayerOpenPackService.openPack(player2, 1);
        //ShowDeckPlayerService.showDeck(player);
        //System.out.println(PlayerFinderService.findPlayer(player.getID()));
        AttackPlayerService.attackPlayer(player, player2);
        System.out.println(HeroFinderService.findHero(player2.getDeck(), 1));
        System.out.println(InMemoryDatabaseHistoryBattle.getInstance());
    }
}