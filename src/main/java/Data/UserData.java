package Data;

/**
 * Created by berestenko on 02.03.17.
 */
public class UserData {
    private String username;
    private String password;

    public UserData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserData(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;

    }
}

