public class Pawn extends Piece {
    /**
     * This variable keeps track of whether a pawn has moved for their initial move option.
     */
    private boolean hasMoved = false;

    public Pawn(int color) {
        super(color);
    }

    @Override
    public char getLetter() {
        return 'p';
    }

    /**
     * returns true if the pawn is allowed to move to the x y space.
     * if the space is capturable,
     * or is unblocked and two forward from its starting position
     * or unblocked and one in front of the pawn
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
