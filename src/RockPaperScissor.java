import java.util.InputMismatchException;
import java.util.Scanner;

public class RockPaperScissor {
    int firstPlayerWinCount;
    int secondPlayerWinCount;
    int drawCount;
    boolean isSecondPlayerComputer;

    final String Rock = "Rock";
    final String Paper = "Paper";
    final String Scissor = "Scissor";

    /*
        get: accessors
     */
    public int getFirstPlayerWinCount() {
        return firstPlayerWinCount;
    }

    public int getSecondPlayerWinCount() {
        return secondPlayerWinCount;
    }

    public int getDrawCount() {
        return drawCount;
    }

    /*
    @brief: Sets the value of SecondPlayer
    value = true => the second player is a computer
    value = false => the second player is a person
     */
    /*
        All mutators: set
     */
    public void setSecondPlayerComputer(boolean value) {
        isSecondPlayerComputer = value;
    }
    /*
    @brief: sets the default values of the variables
     */
    public void setDefaultValue() {
        firstPlayerWinCount = 0;
        secondPlayerWinCount = 0;
        drawCount = 0;
    }

    /*
    @brief: Generates a random integer between 1 to 3
    then, based on the value of 1 to 3, it denotes
    1 = "Rock"
    2 = "Paper"
    3 = "Scissor"
     */
    public String takeComputerInput() {
        int L = 1;
        int R = 3;
        int choice = L + (int) (Math.random() * (R - L + 1));

        String answer;
        if(choice == 1) {
            answer = Rock;
        } else if(choice == 2) {
            answer = Paper;
        } else {
            answer = Scissor;
        }
        return answer;
    }

    /*2
    @brief: takeUserInput takes input from a user
    it uses a while loop to ensure that the user is taking the
    correct input, and a scanner to scan the input.
     */
    public String takeUserInput() {
        Scanner sc =  new Scanner(System.in);
        String input;

        while(true) {
            System.out.print("Enter a choice [Rock, Paper, Scissor]: ");
            input = sc.nextLine();

            // Checks whether the input is properly formated
            boolean okay = false;
            if(input.equals(Rock) || input.equals(Paper) || input.equals(Scissor)) {
                okay = true;
            } else {
                okay = false;
            }

            if(okay) {
                break;
            } else {
                // Warns the user about the invalid choice.
                System.out.print("[Invalid choice!] ");
            }
        }

        return input;
    }
    /*
    @brief: Take the number of rounds as an input from the user
    @return: the number of rounds

     */
    public int takeRoundInput() {
        setDefaultValue();
        Scanner sc = new Scanner(System.in);
        boolean inputTaken = false;
        int rounds = 0;

        // The loop terminates if a valid input has been given
        while (!inputTaken) {
            System.out.print("Enter the number of rounds (press 0 to exit): ");
            rounds = sc.nextInt();
            /*
                The user must take a positive integer as an input.
             */
            if (rounds < 0) {
                System.out.print("[Invalid: round number must be greater than 0] ");
            } else {
                inputTaken = true;
            }
        }
        return rounds;
    }

    /*
    @brief : take the type of game the user wants to play
    1: 1 Player game (play with computer)
    2: 2 Player game (play with user/another person)
     */
    public String takeModeInput() {
        Scanner sc = new Scanner(System.in);
        String gameMode = "0";

        boolean inputTaken = false;

        while(!inputTaken) {
            System.out.print("Enter the mode [1: 1 Player game; 2: 2 Player game]: ");
            gameMode = sc.nextLine();
            /*
            Check for valid input: only 1 or 2 is valid
             */
            if (gameMode.equals("1") || gameMode.equals("2")) {
                inputTaken = true;
            } else {
                System.out.print("[Invalid input!] ");
            }
        }
        return gameMode;
    }


    /*
    @brief: Determines which player will win based on the configuration
    @parameters:
        player1: move of the player 1
        player2: move of the player 2

    player1   |    player2    | result
    __________________________________
    -------- First condition: --------
    Rock      |    Rock       | Draw
    Paper     |    Paper      | Draw
    Scissor   |    Scissor    | Draw

    -------- Second condition: --------
    Rock      |    Scissor    | player1

    -------- Third condition: --------

     */
    public String playRound(String player1, String player2) {
        String winner;
        if(player1.equals(player2)) {
            winner = "Draw";
        } else if((player1.equals(Rock) && player2.equals(Scissor))
                || (player1.equals(Paper) && player2.equals(Rock))
                || (player1.equals(Scissor) && player2.equals(Paper))
        ) {
            winner = "player1";
        } else {
            winner = "player2";
        }
        return winner;
    }

    /*
    @brief: Shows the result of the round:
    First show player1's choice, Second show player2's choice,
    finally show who wins
     */
    public void showRoundResult(String player1, String player2, String roundResult) {
        printBanner("RESULT OF THE ROUND");

        System.out.println("The first player has chosen: " + player1);
        System.out.println("The second player has chosen: " + player2);

        if(roundResult.equals("player1")) {
            System.out.println("Round winner: Player 1!");
        } else if(roundResult.equals("player2")) {
            System.out.println("Round winner: Player 2!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    /*
    @brief: Prints some message as a title
     */
    public void printBanner(String message) {
        System.out.println("--------------------- " + message + " ---------------------");
    }
    /*
    @brief: Plays a game of n number of rounds.

    The function takes User input from player 1, and computer
    or user input based on who is playing, from player 2.

    If the total aggregated result of player 1 is greater than
    that of player 2, then player 1 wins, or vice versa.
     */
    public String playGame(int rounds) {

        for(int i = 1; i <= rounds; i++) {
            printBanner("ROUND NO : " + i);

            String player1 = takeUserInput();
            String player2;

            // Second player: can be either a computer or a person
            if(isSecondPlayerComputer) {
                player2 = takeComputerInput();
            } else {
                player2 = takeUserInput();
            }

            String roundResult = playRound(player1, player2);
            /*
            Player 1 has chosen: Rock
            Player 2 has chosen: Paper
            Result: Player 2 wins!
             */
            if(roundResult.equals("player1")) {
                firstPlayerWinCount++;
            } else if(roundResult.equals("player2")) {
                secondPlayerWinCount++;
            } else {
                drawCount++;
            }
            showRoundResult(player1, player2, roundResult);
        }

        // Assigns the value
        String winner;
        if(firstPlayerWinCount > secondPlayerWinCount) {
            winner = "player1";
        } else if(firstPlayerWinCount < secondPlayerWinCount) {
            winner = "player2";
        } else {
            winner = "Draw";
        }
        return winner;
    }

    /*
    Show the overall results of the game after N rounds
     */
    public void showGameResult(String winner) {
        printBanner("RESULT OF THE GAME");

        System.out.println("First player's score: " + firstPlayerWinCount);
        System.out.println("Second player's score: " + secondPlayerWinCount);
        System.out.println("Draw count: " + drawCount);

        if(winner.equals("player1")) {
            System.out.println("The first player wins!");
        } else if(winner.equals("player2")) {
            System.out.println("The second player wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
    /*
    Extra => feature
     */

    /*
    @brief: Starts a full system, can be played any number of games,
    can be played in multiple rounds
     */
    public void play() {
        Scanner sc = new Scanner(System.in);
        int input;

        while(true) {
            int rounds = takeRoundInput();
            if(rounds == 0) {
                break;
            } else {
                String gameMode = takeModeInput();

                if(gameMode.equals("1")) {
                    setSecondPlayerComputer(true);
                } else {
                    setSecondPlayerComputer(false);
                }

                String winner = playGame(rounds);
                showGameResult(winner);
            }
        }
        System.out.println("Game over!");
    }
}