package by.jrr.statics.service;

import by.jrr.statics.bean.Message;

public final class MessageService {

    private static int messagesSent;

    private MessageService() {
    }

    public static void sendMessage(Message message) {
        messagesSent++;
        System.out.println(String.format("[SENDING NOW  ]: %s", message.getMessage()));
        System.out.println(String.format("[TOTAL  SENT  ]: %s", messagesSent));
    }

    public static int getMessagesSent() {
        return messagesSent;
    }
}
