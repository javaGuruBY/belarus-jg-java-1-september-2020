package by.jrr.statics;

import by.jrr.statics.bean.Message;
import by.jrr.statics.service.MessageService;
import by.jrr.statics.service.MessageServiceInjected;

public class MessageApplication {

    public static void main(String[] args) {

        //regular
//        System.out.println(String.format("Created = %s", Message.instanceCounter));
//        Message greeting = new Message("Hi!");
//        Message question = new Message("How are you?");
//        Message farewell = new Message("Goodbye!");
//
//        System.out.println(String.format("Created = %s", farewell.instanceCounter)); //code smells
//        System.out.println(String.format("Created = %s", farewell.getInstanceCounter())); //code smells
//        System.out.println(String.format("Created = %s", Message.instanceCounter));


        // util service
//        System.out.println(String.format("Created = %s", Message.instanceCounter));
//        Message greeting = new Message("Hi!");
//        Message question = new Message("How are you?");
//        Message farewell = new Message("Goodbye!");
//
//        MessageService.sendMessage(greeting);
//        MessageService.sendMessage(question);
//        MessageService.sendMessage(farewell);
//
//        System.out.println(String.format("\n[total sent ... %s]", MessageService.getMessagesSent()));

        //service with injection
        System.out.println(String.format("Created = %s", Message.instanceCounter));
        var greeting = new Message("Hi!");
        var question = new Message("How are you?");
        var farewell = new Message("Goodbye!");

        var greetingService = new MessageServiceInjected(greeting);
        var questionService = new MessageServiceInjected(question);
        var farewellService = new MessageServiceInjected(farewell);

        greetingService.sendMessage();
        questionService.sendMessage();
        farewellService.sendMessage();
        farewellService.sendMessage();

        System.out.println("greetingService.getMessagesSentByCurrent() = " + greetingService.getMessagesSentByCurrent());
        System.out.println("questionService.getMessagesSentByCurrent() = " + questionService.getMessagesSentByCurrent());
        System.out.println("farewellService.getMessagesSentByCurrent() = " + farewellService.getMessagesSentByCurrent());

        System.out.println(String.format("\n[total sent ... %s]", MessageServiceInjected.getMessagesSent()));
    }
}
