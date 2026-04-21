public abstract class Piece {

    // Black is 2 and White is 1
    private final int COLOR;

    public Piece(int color) {
        COLOR = color;
    }

    /**
     * returns true if Piece is allowed to move to the x y space.
     *
     * @param y
     * @param x
     * @param nY
     * @param nX
     * @param currentBoard
     * @return
     */
    abstract boolean validMove(int y, int x, int nY, int nX, Board currentBoard);

    abstract char getLetter();

    public int getColor() {
        return COLOR;
    }

    public abstract Piece makeCopy();

}
