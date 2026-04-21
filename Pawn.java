public class Pawn extends Piece {
    /**
     * This variable keeps track of whether a pawn has moved for their initial move option.
     */
    protected boolean hasMoved;

    public Pawn(int color) {
        super(color);
        this.hasMoved = false;
    }

    public Pawn(Pawn other) {
        super(other.getColor());
        this.hasMoved = other.hasMoved;
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
     * @return
     */
    @Override
    public boolean validMove(int y, int x, int nY, int nX, Board currentBoard) {

        return false;
    }
}
