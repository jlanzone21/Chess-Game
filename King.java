public class King extends Piece {

    public King(boolean color) {
        super(color);
    }

    @Override
    public boolean validMove(int x, int y) {
        return false;
    }
}
