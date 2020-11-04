package by.jrr.statics.bean;

public class Message {

    public static int instanceCounter;

    private String message;

    public Message(String message) {
        this.message = message;
        instanceCounter++;
        System.out.println(String.format("Total instances created: %s", instanceCounter));
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getInstanceCounter() {
        return instanceCounter;
    }
}
