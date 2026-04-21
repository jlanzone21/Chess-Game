public class King extends Piece {
    /**
     * This variable keeps track of whether a king has moved for castling.
     */
    boolean hasMoved = false;

    /**
     * A king is the ruler by divine mandate. He is able to move one space in any direction.
     * While he remains unthreatened his forces can still win.
     */
    public King(int color) {
        super(color);
    }

    public King(King other) {
        super(other.getColor());
        this.hasMoved = other.hasMoved;
    }

    @Override
    public char getLetter() {
        return 'K';
    }

    /**
     * returns true if the space is one square away,
     * does not put the king in check and is not occupied with a same team piece .
     *
     * @param y
     * @param x
     * @param nY
     * @param nX
     * @param currentBoard
     * @return
     */
    @Override
    public boolean validMove(int y, int x, int nY, int nX, Board currentBoard) {
        return false;
    }
}
