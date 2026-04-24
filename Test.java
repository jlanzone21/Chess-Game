public class Test {

    public static void testCase1() throws Exception {
        Board testBoard = new Board();
        System.out.println(testBoard.displayBoard());
        //System.out.println(testBoard.getPieceAt(7,0).getLetter());
        //testBoard.movePiece('R',1, 4,4);
        //System.out.println(testBoard.getPieceAt(0,1).getLetter());
        //testBoard.movePiece('k',2,3,2);

        testBoard.movePiece('n',-1,5,2);
        System.out.println(testBoard.displayBoard());

        testBoard.movePiece('r', -1,7,1);
        System.out.println(testBoard.displayBoard());

        //testBoard.movePiece('p', -1,4,3);
        //System.out.println(testBoard.displayBoard());

        testBoard.movePiece('p', -1,5,1);
        System.out.println(testBoard.displayBoard());

        testBoard.movePiece('P', 1,2,3);
        testBoard.movePiece('P', 1,3,3);
        System.out.println(testBoard.displayBoard());

        // TODO : Pawn take is broken
        //testBoard.movePiece('p', 1,2,2);
        // System.out.println(testBoard.displayBoard());

        testBoard.movePiece('n', -1,3,3);
        System.out.println(testBoard.displayBoard());

    }

    public static void testBishop() throws Exception {
        Board testBoard = new Board();
        //Pawn moves to b3
        testBoard.movePiece('P', 1,2,1);
        System.out.println(testBoard.displayBoard());

        //Bishop moves to a3
        testBoard.movePiece('B', 1,2,0);
        System.out.println(testBoard.displayBoard());

        //Pawn moves twice
        testBoard.movePiece('P', 1,3,1);
        testBoard.movePiece('P', 1,4,1);
        System.out.println(testBoard.displayBoard());

        //Bishop moves to
        testBoard.movePiece('B', 1,4,2);
        System.out.println(testBoard.displayBoard());

        // Black Pawn moves to
        testBoard.movePiece('p', -1,5,1);
        System.out.println(testBoard.displayBoard());

        //Black Bishop moves to
        testBoard.movePiece('b', -1,5,0);
        System.out.println(testBoard.displayBoard());

        //Black Bishop takes pawn
        testBoard.movePiece('b', -1,4,1);
        System.out.println(testBoard.displayBoard());

        //Black Bishop takes another pawn
        testBoard.movePiece('b', -1,1,4);
        System.out.println(testBoard.displayBoard());

    }

    public static void main(String[] args) throws Exception {
        //testCase1();
        testBishop();

    }
}
