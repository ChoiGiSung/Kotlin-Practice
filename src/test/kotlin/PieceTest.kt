import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec

class PieceTest : AnnotationSpec(){

    @Test
    fun makePiece(){
        verifyPawn(Piece.BLACK_COLOR,Piece.BLACK_REPRESENTATION)
        verifyPawn(Piece.WHITE_COLOR,Piece.WHITE_REPRESENTATION)
    }

    fun verifyPawn(color:String,name:String) {
        var piece = Piece(color,name)
        piece.color shouldBe color
        piece.name shouldBe name
    }

    @Test
    fun colorCheck(){
        var whitePiece = Piece.createWhitePawn()
        var blackPiece = Piece.createBlackPawn()

        whitePiece.isWhite() shouldBe true
        blackPiece.isBlack() shouldBe true
    }
}
