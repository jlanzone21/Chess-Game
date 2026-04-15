public class King extends Piece {
    /**
     * This variable keeps track of whether a king has moved for castling.
     */
    private boolean hasMoved = false;

    /**
     * A king is the ruler by divine mandate. He is able to move one space in any direction.
     * While he remains unthreatened his forces can still win.
     */
    public King(boolean color) {
        super(color);
    }

    @Override
    public char getLetter() {
        return 'K';
    }

    /**
     * returns true if the space is one square away,
     * does not put the king in check and is not occupied with a same team piece .
     * @param x
     * @param y
     * @return
     */
    @Override
    public boolean validMove(int x, int y) {
        return false;
    }
}
