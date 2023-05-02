package Entities;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class User {
    private String username;
    private String password;
    private String budgetFilePath;

    /**
     * Creates new User with provided username and password
     * @param username A String containing a User's chosen username.
     * @param password A String containing a User's chosen password.
     * @throws IOException
     */
    public User(String username, String password) throws IOException {
        this.username = username;
        this.password = password;
        this.budgetFilePath = "src/main/java/data/"+username+".csv";
        Files.createFile(Paths.get(budgetFilePath));
    }

    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
    public String getBudgetFilePath() {
        return this.budgetFilePath;
    }
    public void changeUsername(String newName) {
        this.username = newName;
    }
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }
}
