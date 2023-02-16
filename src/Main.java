import database.InMemoryDatabasePlayer;
import model.Player;

import static database.InMemoryDatabasePlayer.IN_MEMORY_DATABASE;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Player player = new Player("11");
        InMemoryDatabasePlayer.savePlayer(player);
        for (String player1: IN_MEMORY_DATABASE.keySet()){
            System.out.println(player1);
        }
    }
}