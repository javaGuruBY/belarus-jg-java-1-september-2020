package by.jrr.statics.service;

import by.jrr.statics.bean.Message;

public class MessageServiceInjected {

    private static int messagesSent;
    private int messagesSentInCurrentServiceInstance;

    private Message message;

    public MessageServiceInjected(Message message) {
        this.message = message;
    }

    public void sendMessage() {
        incrementCounters();
        printLogs();
    }

    public static int getMessagesSent() {
        return messagesSent;
    }

    public int getMessagesSentByCurrent() {
        return messagesSentInCurrentServiceInstance;
    }

    private void incrementCounters() {
        messagesSent++;
        messagesSentInCurrentServiceInstance++;
    }

    private void printLogs() {
        System.out.println(String.format("[SENDING NOW  ]: %s", this.message.getMessage()));
        System.out.println(String.format("[TOTAL  SENT  ]: %s", messagesSent));
    }
}
