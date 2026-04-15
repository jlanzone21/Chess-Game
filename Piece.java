public abstract class Piece {

    // Black is FALSE and White is TRUE
    private boolean color = true;
    private char letter;
    private int x;
    private int y;

    public Piece() {}

    // returns true if a piece is allowed to move to a space
    abstract boolean validMove(int x, int y);

    public void setKing() {
        this.color = true;
    }

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
