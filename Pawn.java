public class Pawn extends Piece {
    /**
     * This variable keeps track of whether a pawn has moved for their initial move option.
     */
    private boolean hasMoved = false;
    public Pawn() {}

    @Override
    public boolean validMove(int x, int y) {
        return false;
    }
}
