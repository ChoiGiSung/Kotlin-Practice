import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec

class PieceTest : AnnotationSpec(){

    @Test
    fun makePiece(){
        verifyPawn(Piece.BLACK_COLOR,Piece.Type.QUEEN.getBlackRepresentation())
        verifyPawn(Piece.WHITE_COLOR,Piece.Type.KING.getBlackRepresentation())
    }

    fun verifyPawn(color:String, representation:String) {
        var piece = Piece(color,representation)
        piece.color shouldBe color
        piece.representation shouldBe representation
    }

    @Test
    fun colorCheck(){
        var whitePiece = Piece.createWhitePawn()
        var blackPiece = Piece.createBlackPawn()

        whitePiece.isWhite() shouldBe true
        blackPiece.isBlack() shouldBe true
    }
}
