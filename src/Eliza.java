import java.util.Scanner;

public class Eliza {
    public static void main(String[] args){
        String welcomeMessage = "Welcome to ElizaChats! My name is Eliza, What's your name?";
        System.out.println(welcomeMessage);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Nice to meet you, " + name + ", How has your day been?");
        String response = scanner.nextLine();

        String elizaResponse = "Okay, Anything in particular that makes you feel that " + response + "?";
        System.out.println(elizaResponse);

        String lastResponse = scanner.nextLine();

        String elizaGoodbye = "Okay, Well it has been my pleasure to speak with you. Have a nice day!";
        String allAnswers = name + " " + response + " " + lastResponse;

        System.out.println(elizaGoodbye + "\nHere are your responses: " + allAnswers);

//        Starts with a greeting message
//        Asks the user for their name, intakes the user name using Scanner class.
//        Prompts the user to tell Eliza how their day has been
//        Lastly prints all of the user's input at the end of the conversation.



//        Welcome to ElizaChats! My name is Eliza, What's your name?
//        Hannah Snow
//        Nice to meet you, Hannah Snow, How has your day been?
//        It has been a splendid day!
//                Okay, Anything in particular that makes you feel that It has been a splendid day! ?
//                Yes, I got a job promotion :)
//        Okay, Well it has been my pleasure to speak with you. Have a nice day!
//
//                Here are your responses: Hannah Snow It has been a splendid day! Yes, I got a job promotion :)
    }
}
