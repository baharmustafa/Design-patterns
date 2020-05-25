package users;

public class User extends ChatUser {

    public void User(String username) {
        this.username = username;
    }

    @Override
    public void receive(String message) {
        System.out.println(username + " <-- " + message);
    }

}