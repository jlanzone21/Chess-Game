public abstract class Piece {

    // Black is FALSE and White is TRUE
    private final boolean COLOR;
    private char letter;
    private int x;
    private int y;

    public Piece(boolean color) {
        COLOR = color;
    }

    // returns true if a piece is allowed to move to a space
    abstract boolean validMove(int x, int y);

    public char getLetter() {
        return letter;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
