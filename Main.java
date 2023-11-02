import games.Game;
import reviews.Review;
import catalog.GameCatalog;
import users.UserManager;

public class Main {
    public static void main(String[] args) {
        GameCatalog catalog = new GameCatalog();
        UserManager userManager = UserManager.getInstance();

        Game game1 = new Game("The Witcher 3", 49.99, "RPG");
        game1.addReview(new Review("Player1", "Great game!"));
        game1.addReview(new Review("Player2", "Awesome graphics!"));

        Game game2 = new Game("Minecraft", 29.99, "Sandbox");
        game2.addReview(new Review("Player3", "Endless fun!"));

        Game game3 = new Game("CS:GO", 14.99, "FPS");
        game3.addReview(new Review("Player4", "Competitive gaming!"));

        catalog.addGame(game1);
        catalog.addGame(game2);
        catalog.addGame(game3);

        catalog.displayGames();

        double totalPrice = catalog.calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);
    }
}