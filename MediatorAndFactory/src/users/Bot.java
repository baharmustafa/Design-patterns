package users;

public class Bot extends ChatUser {

	    public Bot(String username) {
	        this.username = username;
	    }

	    @Override
	    public void receive(String message) {
	        System.out.println(username + " <-- " + message);
	    }
	}

