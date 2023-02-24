import database.InMemoryDatabasePlayer;
import domain.functional.model.Player;
import domain.functional.service.PlayerOpenPackService;
import domain.functional.service.*;

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
        player2 = PlayerOpenPackService.openPack(player2, 2);
        ShowDeckPlayerService.showDeck(player2);
        //System.out.println(PlayerFinderService.findPlayer(player.getID()));
        while(!player2.playerLoss() && !player.playerLoss()) {
            AttackPlayerService.attackPlayer(player, player2);
            AttackPlayerService.attackPlayer(player2, player);
        }
        if(player2.playerLoss())
            System.out.println("Le joueur 1 à gagner");
        else
            System.out.println("Le joueur 2 à gagner");
        System.out.println("deck joueur 1 " + ShowDeckPlayerService.showDeck(player));
        System.out.println("deck joueur 2 " + ShowDeckPlayerService.showDeck(player2));
        //System.out.println(InMemoryDatabaseHistoryBattle.getInstance());
    }
}