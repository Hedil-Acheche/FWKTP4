package tn.rnu.eniso.messagingapp.service;

import org.springframework.stereotype.Service;
import tn.rnu.eniso.messagingapp.model.MessageDTO;
import tn.rnu.eniso.messagingapp.dal.MessageDao;

@Service
public class ChatService {

    private final MessageDao messageDao;

    // Constructor injection
    public ChatService(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    public void sendMessage(MessageDTO message) {
        messageDao.add(message);
    }

    public MessageDTO receiveMessage(String receiverName) throws InterruptedException {
        return messageDao.removeFirst(receiverName);
    }
}
