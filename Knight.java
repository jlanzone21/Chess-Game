public class Knight extends Piece {
    /**
     * The leapfrogs of the kingdom. Knights are able to jump over pieces but can only move in a very specific way.
     * @param color
     */
    public Knight(Boolean color) {
        super(color);
    }

    /** returns true if Knight is allowed to move to a space
    * ie if the space is not occupied by friendly forces and is 2 and 1 away. */
    @Override
    public boolean validMove(int x, int y) {
        return false;
    }
}
