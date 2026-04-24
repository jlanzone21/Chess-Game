public class Bishop extends Piece {

    // Bishops move diagonally as far as they want
    public Bishop(int color) {
        super(color);
    }

    public Bishop(Bishop other) {
        super(other.getColor());
    }

    @Override
    public char getLetter() {
        if(getColor() == 1)
            return 'B';
        else{return 'b';}
    }

    @Override
    public Bishop makeCopy() {
        return new Bishop(this);
    }

    /**Returns true if a Bishop is allowed to move to a space
    * ie. if it is diagonal from the Bishop
    * And unblocked and in bounds */
    @Override
    public boolean validMove(int x, int y, int nY, int nX, Board currentBoard) {
        if (inBounds(nY, nX)) {
            int ratio = (x - nY + 1) / (y - nX + 1);
            if (ratio == 1 || ratio == -1) {
                // Check whether pieces are in the way or not
                // TODO : FInish this
                int xstart, xfinish, ystart, yfinish;
                if (x > nX) {
                    xstart = nX + 1;
                    xfinish = x;
                } else {
                    xstart = x + 1;
                    xfinish = nX;
                }
                if (y > nY) {
                    ystart = nY + 1;
                    yfinish = y;
                } else {
                    ystart = y + 1;
                    yfinish = nY;
                }
                for (int i = xstart; i < xfinish; i++) {
                    for (int j = ystart; j < yfinish; j++) {
                        if (currentBoard.spaceColor(j, i) != 0) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
