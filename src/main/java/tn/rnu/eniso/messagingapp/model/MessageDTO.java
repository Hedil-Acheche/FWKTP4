package tn.rnu.eniso.messagingapp.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MessageDTO {

    String message_body;
    String sender_name;
    String receiver_name;

}
