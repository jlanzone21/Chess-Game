public class Rook extends Piece {
    /**
     * This variable keeps track of whether a rook has moved for castling.
     */
    private boolean hasMoved = false;
    /**
     * A rook is a symbol of security. It is able to move both horziontally and vertically.
     */
    public Rook(int color) {
        super(color);
    }

    public Rook(Rook other) {
        super(other.getColor());
        this.hasMoved = other.hasMoved;
    }

    @Override
    public char getLetter() {
        return 'R';
    }

    @Override
    public Rook makeCopy() {
        return new Rook(this);
    }

    /**
     * Determines if
     * @return
     */
    public boolean pieceInWay() {
        return false;
    }

    /**
     * returns true if Rook is allowed to move to a space.
     * If the square is unblocked or occupied with the enemy and in the rooks column or row.
     *
     * @param x
     * @param y
     * @param nY
     * @param nX
     * @param currentBoard
     * @return
     */
    @Override
    public boolean validMove(int x, int y, int nY, int nX, Board currentBoard) {

        return false;
    }
}
