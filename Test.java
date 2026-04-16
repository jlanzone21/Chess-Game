public class Test {
    public static void main(String[] args) {
        Board testBoard = new Board();
        //System.out.println(testBoard.displayBoard());
        System.out.println(testBoard.getPieceAt(0,0).getColor()==testBoard.getPieceAt(7,7).getColor());
    }
}
