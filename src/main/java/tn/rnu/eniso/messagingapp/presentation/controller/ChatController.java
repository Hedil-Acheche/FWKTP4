package tn.rnu.eniso.messagingapp.presentation.controller;

import org.springframework.web.bind.annotation.*;
import tn.rnu.eniso.messagingapp.model.MessageDTO;
import tn.rnu.eniso.messagingapp.service.ChatService;

@RestController
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/chat/send")
    public void sendMessage(@RequestBody MessageDTO message) {
        chatService.sendMessage(message);
    }

    @GetMapping("/chat/receive")
    public MessageDTO receiveMessage(@RequestParam String receiverName) throws InterruptedException {
        return chatService.receiveMessage(receiverName);
    }
}
