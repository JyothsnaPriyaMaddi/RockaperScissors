import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', ChooseL rock, paper or scissors.");
        System.out.println("\nAre you ready? Write 'yes' if you are.");

        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("yes")) {
            System.out.println("Great!\nrock - paper - scissors, shoot!");
            String userChoice = sc.nextLine();
            System.out.println("\nYou chose: "+userChoice);
            String computerChoice = computerChoice();
            System.out.print("The computer chose: "+computerChoice+"\n");
            
            System.out.print("The result: ");
            result(userChoice, computerChoice);

        } else {
            System.out.println("Darn, some other time...!");
        }


    }
    public static String computerChoice() {
        int randomNumber = (int)(Math.random() * 3);
        switch(randomNumber) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
        }
        return null;
    }
    public static void result(String userChoice, String computerChoice)  {
        String result;
        if((userChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) || (userChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock") || userChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper"))) {
            result = "Your win";
            System.out.println(result);
        } else if((userChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("rock")) || (userChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("paper")) || (userChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("scissors"))) {
            result = "You lose";
            System.out.println(result);
        } else if((userChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("rock")) || (userChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("paper")) || userChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("scissors")){
            result = "It's a tie";
            System.out.println(result);
        } else {
            result = "INVALID CHOICE";
            System.out.println(result);
            System.exit(0);
        }
    }
}