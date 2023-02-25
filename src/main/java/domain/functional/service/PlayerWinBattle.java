package domain.functional.service;

import domain.functional.model.Player;

public class PlayerWinBattle {
    public static Player playerWinBattle(Player player){
        if(player.getNumberBattleWin()%5 == 0 && player.getNumberBattleWin() != 0)
            player = player.playerWinBattle(player, 1, 0);
        player = player.playerWinBattle(player, 0, 1);
        return player;
    }
}
