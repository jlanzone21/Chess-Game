public class Knight extends Piece {
    /**
     * The leapfrogs of the kingdom. Knights are able to jump over pieces but can only move in a very specific way.
     * @param color
     */
    public Knight(int color) {
        super(color);
    }

    @Override
    public char getLetter() {
        return 'k';
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
        return false;
    }
}
