public class Rook extends Piece {
    /**
     * This variable keeps track of whether a rook has moved for castling.
     */
    private boolean hasMoved = false;

    /**
     * A rook is a symbol of security. It is able to move both horziontally and vertically.
     */
    public Rook(int color) {
        super(color);
    }

    public Rook(Rook other) {
        super(other.getColor());
        this.hasMoved = other.hasMoved;
    }

    @Override
    public char getLetter() {
        return 'R';
    }

    @Override
    public Rook makeCopy() {
        return new Rook(this);
    }

    /**
     * returns true if Rook is allowed to move to a space.
     * If the square is unblocked or occupied with the enemy and in the rooks column or row.
     *
     * @param y
     * @param x
     * @param nY
     * @param nX
     * @param currentBoard
     * @return
     */
    @Override
    public boolean validMove(int y, int x, int nY, int nX, Board currentBoard) {
        // Checks if new location is in the same row
        if (x == nX) {
            for (int i = y; i < 8; i++) {
                // Checks if there is a piece in the way
                if (currentBoard.spaceColor(i, x) != 0 && i != nY) {
                    return false;
                }
            }
            for (int i = y; i >= 0; i--) {
                // Checks if there is a piece in the way
                if (currentBoard.spaceColor(i, x) != 0 && i != nY) {
                    return false;
                }
            }
            return true;
        }
        // Checks if in the same column
        else if (y == nY) {
            for (int i = x; i < 8; i++) {
                // Checks if there is a piece in the way
                if (currentBoard.spaceColor(y, i) != 0 && i != nX) {
                    return false;
                }
            }
            for (int i = x; i >= 0; i--) {
                // Checks if there is a piece in the way
                if (currentBoard.spaceColor(y, i) != 0 && i != nX) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}

