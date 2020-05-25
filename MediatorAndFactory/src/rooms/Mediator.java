package rooms;

	import java.util.ArrayList;
	import java.util.List;

import users.ChatUser;

	
	public abstract class Mediator {
	    public List<ChatUser> activeVisitors = new ArrayList<ChatUser>();
	    public abstract void send(String message, ChatUser sender);
	    public abstract void register(ChatUser user);
	    public abstract void unRegister(ChatUser user);
	}

