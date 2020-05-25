package users;

public class Factory {
	public ChatUser getChatUser(String chatUserType, String username){
        if(chatUserType == null){
            return null;
        }
        if(chatUserType.equalsIgnoreCase("User")){
            return new User();

        } else if(chatUserType.equalsIgnoreCase("Bot")){
            return new Bot("ChatBot");
        }
        return null;
    }

}
