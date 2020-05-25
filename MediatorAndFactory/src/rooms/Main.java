package rooms;

import users.ChatUser;
import users.Factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new Factory();

        ChatUser Bahar = factory.getChatUser("User", "Bahar");
        ChatUser Ivan = factory.getChatUser("User", "Ivan");
        ChatUser Maria = factory.getChatUser("User", "Maria");

        ChatRoom NoCats = new ChatRoom();
        Bahar.enter(NoCats);
        Ivan.enter(NoCats);
        Maria.enter(NoCats);

        Bahar.send("Здравейте, приятели");
        Ivan.send("Здрастии! ");
        Maria.send("Хехехе");

        Ivan.send("addBot");
        Bahar.send("cat");

    }

	}
