public abstract class Piece {
    private int x;
    private int y;
    private boolean king = false;

    public Piece(int x, int y) {

    }

    abstract void move();

    public void setKing() {
        this.king = true;
    }

    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

}
