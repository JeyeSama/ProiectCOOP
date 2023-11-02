package games;

import java.util.ArrayList;

public class GameCatalog {
    private ArrayList<Game> games;

    public GameCatalog() {
        this.games = new ArrayList<>();
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
