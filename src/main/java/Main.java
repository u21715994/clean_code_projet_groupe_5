import database.InMemoryDatabasePlayer;
import domain.functional.model.Hero;
import domain.functional.model.Player;
import domain.functional.service.PlayerOpenPackService;
import domain.functional.service.*;

import java.util.List;

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
        while(!player2.playerLoss() && !player.playerLoss()) {
            List<Hero> heroesInvolved = new SelectHeroFirstInDeckService().selectHero(player, player2);
            AttackPlayerService.attackPlayer(heroesInvolved.get(0), heroesInvolved.get(1));
            UpdatePlayerInDatabaseService.updatePlayer(player.getID(), player);
            AttackPlayerService.attackPlayer(heroesInvolved.get(1), heroesInvolved.get(0));
            UpdatePlayerInDatabaseService.updatePlayer(player2.getID(), player2);
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