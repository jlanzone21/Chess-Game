public class Test {
    public static void main(String[] args) throws Exception {
        Board testBoard = new Board();
        System.out.println(testBoard.displayBoard());
        //System.out.println(testBoard.getPieceAt(7,0).getLetter());
        //testBoard.movePiece('R',1, 4,4);
        //System.out.println(testBoard.getPieceAt(0,1).getLetter());
        //testBoard.movePiece('k',2,3,2);

        testBoard.movePiece('k',2,5,2);
        //System.out.println(testBoard.displayBoard());

        testBoard.movePiece('R', 2,7,1);
        //System.out.println(testBoard.displayBoard());

        // TODO: Pawn Double move is broken
        //testBoard.movePiece('p', 1,4,3);
        //System.out.println(testBoard.displayBoard());

        testBoard.movePiece('p', 2,5,1);
        System.out.println(testBoard.displayBoard());

        testBoard.movePiece('p', 1,2,3);
        testBoard.movePiece('p', 1,3,3);
        //testBoard.movePiece('p', 1,3,3);
        System.out.println(testBoard.displayBoard());

        // TODO : Pawn take is broken
        //testBoard.movePiece('p', 1,2,2);
       // System.out.println(testBoard.displayBoard());

        testBoard.movePiece('k', 2,3,3);
        System.out.println(testBoard.displayBoard());

        testBoard.movePiece('B', 2,5,0);
        System.out.println(testBoard.displayBoard());
        testBoard.movePiece('B', 2,1,4);
        System.out.println(testBoard.displayBoard());




    }
}
