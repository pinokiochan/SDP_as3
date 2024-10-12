import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator {
    private List<User> users;

    public ChatRoom() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            // Don't send the message to the user who sent it
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }
}
