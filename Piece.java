public abstract class Piece {

    private boolean king = false;

    public Piece() {}


    abstract void move();

    public void setKing() {
        this.king = true;
    }
}
