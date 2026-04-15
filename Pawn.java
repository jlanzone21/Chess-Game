public class Pawn extends Piece {
    /**
     * This variable keeps track of whether a pawn has moved for their initial move option.
     */
    private boolean hasMoved = false;

    public Pawn(boolean color) {
        super(color);
    }

    @Override
    public boolean validMove(int x, int y) {
        return false;
    }
}
