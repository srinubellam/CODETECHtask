import java.util.Scanner;

class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to SimpleChatbot! How can I assist you today?");
        
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();
            
            // Preprocess user input (e.g., convert to lowercase)
            userInput = userInput.toLowerCase();
            
            // Respond based on user input
            String botResponse = generateResponse(userInput);
            System.out.println("Bot: " + botResponse);
            
            // Exit if user says goodbye
            if (userInput.equals("goodbye")) {
                System.out.println("Bot: Goodbye! Have a great day.");
                break;
            }
        }
        
        scanner.close();
    }
    
    public static String generateResponse(String userInput) {
        // Simple rule-based responses based on user input
        if (userInput.contains("hello")) {
            return "Hello! How can I help you?";
        } else if (userInput.contains("how are you")) {
            return "I'm just a bot, but thank you for asking!";
        } else if (userInput.contains("weather")) {
            return "I'm sorry, I don't have weather information.";
        } else {
            return "I'm sorry, I didn't understand that.";
        }
    }
}
