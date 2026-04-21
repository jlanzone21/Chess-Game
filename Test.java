public class Test {
    public static void main(String[] args) {
        Board testBoard = new Board();
        System.out.println(testBoard.displayBoard());
        System.out.println(testBoard.getPieceAt(7,0).getLetter());
        try {
            testBoard.movePiece('R',1, 4,4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
