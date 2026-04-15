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
     * This main will run the entire game and loop through turns into a player has won
     * or a stalemate has been reached.
     * @param args
     */
    public static void main(String[] args) {

    }
}
