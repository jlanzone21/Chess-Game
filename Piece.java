public abstract class Piece {

    private boolean color = false;
    private char letter;

    public Piece() {}

    // returns true if a piece is allowed to move to a space
    abstract boolean validMove(int x, int y);

    public void setKing() {
        this.color = true;
    }

    public char getLetter() {
        return letter;
    }
}
