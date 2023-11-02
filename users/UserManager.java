import java.io.*;
import java.util.ArrayList;
import games.Game;

public class UserManager {
    private static UserManager instance;
    private ArrayList<User> users;
    private String usersDataFile = "UsersData.txt"; // Numele fișierului pentru datele utilizatorilor

    private UserManager() {
        users = new ArrayList<>();
        loadUsersData(); // Încarcă datele utilizatorilor la inițializare
    }

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public boolean addUser(String username) {
        User user = new User(username);
        boolean added = users.add(user);
        if (added) {
            saveUsersData(); // Salvează datele utilizatorilor după adăugarea unui utilizator nou
        }
        return added;
    }

    public boolean removeUser(String username) {
        User user = getUser(username);
        if (user != null) {
            users.remove(user);
            saveUsersData(); // Salvează datele utilizatorilor după ștergerea unui utilizator
            return true;
        }
        return false;
    }

    public User getUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null; // Utilizatorul nu a fost găsit
    }

    public void login(String username, String password) {
        // Autentificare
        System.out.println("User '" + username + "' logged in.");
    }

    public void addGameToUserCatalog(String username, Game game) {
        User user = getUser(username);
        if (user != null) {
            user.getGameCatalog().addGameForUser(username, game);
        }
    }

    public void removeGameFromUserCatalog(String username, Game game) {
        User user = getUser(username);
        if (user != null) {
            user.getGameCatalog().removeGameForUser(username, game);
        }
    }

    private void saveUsersData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(usersDataFile))) {
            oos.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadUsersData() {
        File file = new File(usersDataFile);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(usersDataFile))) {
                users = (ArrayList<User>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
