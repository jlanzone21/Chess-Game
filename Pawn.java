public class Pawn extends Piece {

    public Pawn(boolean color) {
        super(color);
    }

    @Override
    public boolean validMove(int x, int y) {
        return false;
    }
}
