package service;

import model.Player;

public class ShowDeckPlayerService {
    public static void showDeck(Player player){
        System.out.println(player.getDeck());
    }
}
