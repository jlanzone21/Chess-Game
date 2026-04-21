public class Test {
    public static void main(String[] args) throws Exception {
        Board testBoard = new Board();
        System.out.println(testBoard.displayBoard());
        //System.out.println(testBoard.getPieceAt(7,0).getLetter());
        //testBoard.movePiece('R',1, 4,4);
        System.out.println(testBoard.getPieceAt(0,1).getLetter());
        //testBoard.movePiece('k',2,3,2);
        testBoard.movePiece('k',2,2,2);

        System.out.println(testBoard.displayBoard());

        //testBoard.movePiece('R', 2,0,1);

        //System.out.println(testBoard.displayBoard());



    }
}
