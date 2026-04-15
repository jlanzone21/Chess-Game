public class Bishop extends Piece {

    // Bishops move diagonally as far as they want
    public Bishop(Boolean color) {
        super(color);
    }

    @Override
    public char getLetter() {
        return 'B';
    }

    /**Returns true if a Bishop is allowed to move to a space
    * ie. if it is diagonal from the Bishop
    * And unblocked and in bounds */
    @Override
    public boolean validMove(int y, int x) {
        return false;
    }
}
