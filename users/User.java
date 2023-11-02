package users;
import games.Game;
import java.util.ArrayList;

public class User {
    private String username;
    private String password;  // Adăugați un câmp pentru stocarea parolei
    private UserGameCatalog gameCatalog;

    public User(String username) {
        this.username = username;
        this.gameCatalog = new UserGameCatalog();
    }

    // Adăugați un constructor pentru a include și parola
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.gameCatalog = new UserGameCatalog();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public UserGameCatalog getGameCatalog() {
        return gameCatalog;
    }
}
