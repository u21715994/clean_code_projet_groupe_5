package database;

import domain.functional.model.Deck;

import java.util.concurrent.ConcurrentHashMap;

public class InMemoryDatabaseDeck {
    private static InMemoryDatabaseDeck INSTANCE;
    private static final java.util.Map<String, Deck> IN_MEMORY_DATABASE = new ConcurrentHashMap<>();

    private InMemoryDatabaseDeck() {
    }

    public static synchronized InMemoryDatabaseDeck getInstance() {
        if (INSTANCE == null) {
            return new InMemoryDatabaseDeck();
        }
        return INSTANCE;
    }

    public boolean saveDeck(Deck deck){
        if(IN_MEMORY_DATABASE.put(deck.getID(), deck) == null)
            return false;
        return true;
    }
}
