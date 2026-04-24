import java.util.Scanner;
import java.util.Stack;

/**
 * This class will hold all the game logic
 */
public class Game {

    private boolean playerTurn = true;
    Board board = new Board();

    /**
     * This might go away because its member variables might just go into main's scope
     */
    public Game() {}

    /**
     * Scans through input and calls board.movePiece() on the right piece
     * @param input String containing move information
     */
    public void takeTurn(String input) {

    }
    /**
     * This main will run the entire game and loop through turns into a player has won
     * or a stalemate has been reached.
     * @param args
     */
    public static void main(String[] args) {
        //new GUI();
        Scanner input = new Scanner(System.in);
        Stack<Board> undoStack = new Stack<>();
        int turn = 1;
        Board gameBoard = new Board();
        //undoStack.push(gameBoard);


        gameLoop:
        while (true) {
            System.out.print(gameBoard.displayBoard());
            while (true) {
                // Loop to make sure that a person makes a valid move
                if (turn == 1)
                    System.out.print("\nYour move White(ex. Nc3): ");
                else
                    System.out.print("\nYour move Black(ex. nf6): ");

                String word = input.next();
                if (word.toLowerCase().equals("quit"))
                    break gameLoop;

                // Works the logic for the undo button
                else if (word.toLowerCase().equals("undo")) {
                    if (!undoStack.empty()) {
                        gameBoard = undoStack.pop();
                        break;
                    } else {
                        System.out.print("There are no moves to undo");
                        continue;
                    }
                }

                // Parses input from scanner into correct movePiece() format
                char letter;
                if (turn == 1)
                    letter = word.toUpperCase().charAt(0);
                else
                    letter = word.toLowerCase().charAt(0);
                int row = word.toLowerCase().charAt(1) - 97;
                int col = word.charAt(2) - 49;

                // Tries to move the piece and catches errors if it fails
                try {
                    undoStack.push(new Board(gameBoard));
                    gameBoard.movePiece(letter, turn, col, row);
                    //System.out.print(gameBoard.displayBoard());
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            //Switches turn
            turn = -1*turn;
        }
    }
}
