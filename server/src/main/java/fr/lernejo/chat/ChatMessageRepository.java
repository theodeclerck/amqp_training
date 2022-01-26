package fr.lernejo.chat;

import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class ChatMessageRepository {
    private final LinkedList<String> messages = new LinkedList<>();

    void addChatMessage(String message){
        if (messages.size() >= 10)
            messages.removeFirst();
        messages.addLast(message);
    }

    List<String> getLastTenMessages(){
        return messages;
    }
}
