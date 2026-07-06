import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y")) {
            String playerA = getMove(input, "Player A");
            String playerB = getMove(input, "Player B");
            displayResult(playerA, playerB);

            System.out.print("Play again? [Y/N]: ");
            playAgain = input.nextLine();
        }

        System.out.println("Thanks for playing!");
        input.close();
    }

    public static String getMove(Scanner input, String playerName) {
        String move;

        while (true) {
            System.out.print(playerName + ", enter your move [R/P/S]: ");
            move = input.nextLine();

            if (move.equalsIgnoreCase("R") || move.equalsIgnoreCase("P") || move.equalsIgnoreCase("S")) {
                return move;
            }

            System.out.println("Invalid move. Please enter R, P, or S.");
        }
    }

    public static void displayResult(String playerA, String playerB) {
        if (playerA.equalsIgnoreCase(playerB)) {
            String name = playerA.equalsIgnoreCase("R") ? "Rock" : playerA.equalsIgnoreCase("P") ? "Paper" : "Scissors";
            System.out.println(name + " vs " + name + ", it's a Tie!");
            return;
        }

        if (playerA.equalsIgnoreCase("R")) {
            System.out.println(playerB.equalsIgnoreCase("S") ? "Rock breaks Scissors. Player A wins!" : "Paper covers Rock. Player B wins!");
        } else if (playerA.equalsIgnoreCase("P")) {
            System.out.println(playerB.equalsIgnoreCase("R") ? "Paper covers Rock. Player A wins!" : "Scissors cuts Paper. Player B wins!");
        } else {
            System.out.println(playerB.equalsIgnoreCase("P") ? "Scissors cuts Paper. Player A wins!" : "Rock breaks Scissors. Player B wins!");
        }
    }
}
