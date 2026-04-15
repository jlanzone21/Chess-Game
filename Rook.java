public class Rook extends Piece {
    /**
     * A rook is a symbol of security. It is able to move both horziontally and vertically.
     */
    public Rook(boolean color) {
        super(color);
    }

    /**
     * returns true if Rook is allowed to move to a space.
     * If the square is unblocked or occupied with the enemy and in the rooks column or row.
     * @param x
     * @param y
     * @return
     */
    @Override
    public boolean validMove(int y, int x) {
        return false;
    }
}
