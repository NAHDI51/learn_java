import java.util.Scanner;

public class RockPaperScissor {
    int firstPlayerWinCount;
    int secondPlayerWinCount;
    boolean isSecondPlayerComputer;

    final String Rock = "Rock";
    final String Paper = "Paper";
    final String Scissor = "Scissor";

    public int getFirstPlayerWinCount() {
        return firstPlayerWinCount;
    }

    public int getSecondPlayerWinCount() {
        return secondPlayerWinCount;
    }

    /*
    @brief: Sets the value of SecondPlayer
    value = true => the second player is a computer
    value = false => the second player is a person
     */
    public void setSecondPlayerComputer(boolean value) {
        isSecondPlayerComputer = value;
        // return value nai
    }
    /*
    @brief: sets the default values of the variables
     */
    public void setDefaultValue() {
        firstPlayerWinCount = 0;
        secondPlayerWinCount = 0;
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

    /*
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
                System.out.println("[Invalid choice!] ");
            }
        }

        return input;
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
    @brief: Plays a game of n number of rounds.

    The function takes User input from player 1, and computer
    or user input based on who is playing, from player 2.

    If the total aggregated result of player 1 is greater than
    that of player 2, then player 1 wins, or vice versa.
     */
    public String playGame(int rounds) {

        for(int i = 0; i < rounds; i++) {
            String player1 = takeUserInput();
            String player2;

            // Second player: can be either a computer or a person
            if(isSecondPlayerComputer) {
                player2 = takeComputerInput();
            } else {
                player2 = takeUserInput();
            }

            String roundResult = playRound(player1, player2);
            if(roundResult.equals("player1")) {
                firstPlayerWinCount++;
            } else if(roundResult.equals("player2")) {
                secondPlayerWinCount++;
            }
        }

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
    @brief: Starts a full system, can be played any number of games,
    can be played in multiple rounds
     */
    public void play() {
        Scanner sc = new Scanner(System.in);
        int input;

        while(true) {
            setDefaultValue();

            System.out.print("Enter the number of rounds (press 0 to exit): ");
            input =  sc.nextInt();

            if(input == 0) {
                break;
            }
            String gameMode;
            while(true) {
                System.out.print("Enter the mode [1: 1 Player game; 2: 2 Player game]: ");
                gameMode = sc.nextLine();

                boolean okay = false;
                if (gameMode.equals("1") || gameMode.equals("2")) {
                    okay = true;
                } else {
                    okay = false;
                }

                if (okay) {
                    break;
                } else {
                    System.out.println("[Invalid input!] ");
                }
            }
            if(gameMode.equals("1")) {
                setSecondPlayerComputer(true);
            } else {
                setSecondPlayerComputer(false);
            }

            playGame(input);
        }
        System.out.println("Game over!");
    }


}