public abstract class Piece {

    // Black is FALSE and White is TRUE
    private final boolean COLOR;
    private char letter;
    private int x;
    private int y;

    public Piece(boolean color) {
        COLOR = color;
    }

    /**
     * returns true if Piece is allowed to move to the x y space.
     * @param x
     * @param y
     * @return
     */
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
