public class Pawn extends Piece {
    /**
     * This variable keeps track of whether a pawn has moved for their initial move option.
     */
    private boolean hasMoved = false;

    public Pawn(boolean color) {
        super(color);
    }
    /**
     * returns true if the pawn is allowed to move to the x y space.
     * if the space is capturable,
     * or is unblocked and two forward from its starting position
     * or unblocked and one in front of the pawn
     * @param x
     * @param y
     * @return
     */
    @Override
    public boolean validMove(int x, int y) {
        return false;
    }
}
