package users;

import games.Game;
import java.util.ArrayList;

public class UserGameCatalog {
    private ArrayList<Game> games;

    public UserGameCatalog() {
        games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void removeGame(String gameTitle) {
        Game gameToRemove = null;
        for (Game game : games) {
            if (game.getTitle().equals(gameTitle)) {
                gameToRemove = game;
                break;
            }
        }
        if (gameToRemove != null) {
            games.remove(gameToRemove);
        }
    }

    public ArrayList<Game> getGames() {
        return games;
    }
}
