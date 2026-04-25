import static java.lang.Math.abs;
public class Pawn extends Piece {

    public Pawn(int color) {
        super(color);
    }

    public Pawn(Pawn other) {
        super(other.getColor());
    }

    @Override
    public char getLetter() {
        if(getColor() == 1)
            return 'P';
        else{return 'p';}
    }

    @Override
    public Pawn makeCopy() {
        return new Pawn(this);
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
        if (!inBounds(nY,nX)) {
            return false;
        }
        //White
        // TODO : Make this logic consistent with a zero array (start at 0 not 1. We will change the input to computer code in Game)
        if(getColor()==1) {
            //Double jump pawn logic
            if(y == 1 && nX == x && nY == 3 && currentBoard.spaceColor(3,nX) == 0 && currentBoard.spaceColor(2,nX) == 0){
                return true;
            }
            //move logic
            else if(x== nX && y == nY - 1 && currentBoard.spaceColor(nY,nX) == 0){
                return true;
            }
            //capture logic
            else if(abs(nX - x) == 1 && nY - 1 == y && currentBoard.spaceColor(nY,nX) == -1){
                return true;
            }
        }
        //Black
        else if(getColor()==-1){
            //Double jump pawn logic
            if(y == 6 && nX == x && nY == 4 && currentBoard.spaceColor(4,nX) == 0 && currentBoard.spaceColor(5,nX) == 0){
                return true;
            }
            //move logic
            else if(x== nX && y == nY + 1 && currentBoard.spaceColor(nY,nX) == 0){
                return true;
            }
            //capture logic
            else if(abs(nX - x) == 1 && nY + 1 == y && currentBoard.spaceColor(nY,nX) == 1){
                return true;
            }

        }


        return false;
    }
}
