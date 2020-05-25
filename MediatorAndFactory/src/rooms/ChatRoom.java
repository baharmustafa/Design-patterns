package rooms;

import users.ChatUser;

public class ChatRoom extends Mediator {
    @Override
    public void send(String message, ChatUser sender) {
        for (ChatUser visitor : activeVisitors) {
            if (visitor != sender){
                visitor.receive(message);
            }
            
        }
    }

    @Override
    public void register(ChatUser user) {
        activeVisitors.add(user);
    }

    @Override
    public void unRegister(ChatUser user) {
        activeVisitors.remove(user);
    }
}