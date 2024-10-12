public class Main {
    public static void main(String[] args) {
        // Create the chat room (mediator)
        ChatRoom chatRoom = new ChatRoom();

        // Create users and register them with the chat room
        User user1 = new User("Beibars", chatRoom);
        User user2 = new User("Astana", chatRoom);
        User user3 = new User("Merey", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        // Users send messages
        user1.sendMessage("Hi everyone!");
        user2.sendMessage("Hello Beibars!");
        user3.sendMessage("Hey all!");
    }
}
