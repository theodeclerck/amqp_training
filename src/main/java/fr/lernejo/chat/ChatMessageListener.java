package fr.lernejo.chat;

import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {
    final ChatMessageRepository chatMessageRepository;

    public ChatMessageListener(ChatMessageRepository repository){
        this.chatMessageRepository = repository;
    }

    public void onMessage(String message){
        chatMessageRepository.addChatMessage(message);
    }

}
