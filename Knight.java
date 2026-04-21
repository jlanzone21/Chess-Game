public class Knight extends Piece {
    /**
     * The leapfrogs of the kingdom. Knights are able to jump over pieces but can only move in a very specific way.
     * @param color
     */
    public Knight(int color) {
        super(color);
    }

    public Knight(Knight other) {
        super(other.getColor());
    }

    @Override
    public char getLetter() {
        return 'k';
    }

    @Override
    public Knight makeCopy() {
        return new Knight(this);
    }

    /**
     * returns true if Knight is allowed to move to a space
     * ie if the space is not occupied by friendly forces and is 2 and 1 away.
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
        if (nY > 7 || nY < 0 || nX > 7 || nX < 0) {
            return false;
        } else if (nX == x + 2 || nX == x - 2) {
            if (nY == y + 1 || nY == y - 1) {
                return true;
            }
        } else if (nX == x + 1 || nX == x - 1) {
            if (nY == y - 2 || nY == y - 2) {
                return true;
            }
        }
        return false;
    }
}
