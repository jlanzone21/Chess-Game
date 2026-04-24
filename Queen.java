public class Queen extends Piece {
    /**
     * A queen is female monarch. The most powerful of chess pieces,
     * a queen is able to move like a bishop and a rook.
     */
    public Queen(int color) {
        super(color);
    }

    public Queen(Queen other) {
        super(other.getColor());
    }

    @Override
    public char getLetter() {
        if(getColor() == 1)
            return 'Q';
        else{return 'q';}
    }

    @Override
    public Queen makeCopy() {
        return new Queen(this);
    }

    /** returns true if Queen is allowed to move to a space
    ie if the square is diagonally, vertically, politically or horizontally alligned with the Queen
     and is not blocked or occupied by friendly forces*/
    @Override
    public boolean validMove(int x, int y, int nY, int nX, Board currentBoard) {

        return false;
    }
}
