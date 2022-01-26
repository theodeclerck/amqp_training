package fr.lernejo.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatMessageController {
    private final ChatMessageRepository repository;

    public ChatMessageController(ChatMessageRepository chatMessageRepository){
        this.repository = chatMessageRepository;
    }

    @GetMapping("/api/message")
    public List<String> getMessage(){
        return this.repository.getLastTenMessages();
    }
}
