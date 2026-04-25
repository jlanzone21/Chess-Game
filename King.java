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
        if(getColor() == 1)
            return 'K';
        else{return 'k';}
    }

    @Override
    public King makeCopy() {
        return new King(this);
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
        // Checks if one space away
        if (inBounds(nY,nX)) {
            if (y - 1 <= nY && y + 1 >= nY) {
                if (x - 1 <= nX && x + 1 >= nX) {
                    // TODO : test whether in check using other method
                    if(!hasMoved){
                        hasMoved=true;
                    }
                    return true;
                }
            }
        }
        return false;
    }

   // Rules for check: King is threatened - meaning an opposing piece can capture him. In Check.
    // Next move must make this check stop. By moving the king, blocking the threat, or by capturing the threat.
}
