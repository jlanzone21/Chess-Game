import static java.lang.Math.abs;

public class Bishop extends Piece {

    // Bishops move diagonally as far as they want
    public Bishop(int color) {
        super(color);
    }

    public Bishop(Bishop other) {
        super(other.getColor());
    }

    @Override
    public char getLetter() {
        if(getColor() == 1)
            return 'B';
        else{return 'b';}
    }

    @Override
    public Bishop makeCopy() {
        return new Bishop(this);
    }

    /**Returns true if a Bishop is allowed to move to a space
    * ie. if it is diagonal from the Bishop
    * And unblocked and in bounds */
    @Override
    public boolean validMove(int y, int x, int nY, int nX, Board currentBoard) {
        if (inBounds(nY, nX)) {
            //if (abs(y - nY) == abs(x - nX) || abs(x - nY) == abs(y - nX)) {
            if (abs(y - nY) == abs(x - nX)) {
                // Check whether pieces are in the way or not
                // Start at the Bishop's current square
                int xstart = x,ystart = y;
                // Move one step in the direction of the desired location
                while (true) {
                    if (nY > ystart)
                        ystart++;
                    else
                        ystart--;
                    if (nX > xstart)
                        xstart++;
                    else
                        xstart--;
                    // If it is NOT the desired location check if its empty
                    if (!(ystart == nY && xstart == nX)) {
                        if (currentBoard.spaceColor(ystart, xstart) != 0) {
                            return false;
                        }
                    } else {
                        break;
                    }

                }
                return true;
            }
        }
        return false;
    }
}
