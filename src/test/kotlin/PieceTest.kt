import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec

class PieceTest : AnnotationSpec(){

    @Test
    fun test(){
        verifyPawn(Piece.BLACK_COLOR,Piece.BLACK_REPRESENTATION)
        verifyPawn(Piece.WHITE_COLOR,Piece.WHITE_REPRESENTATION)
    }

    @Test
    fun testDefaultConstruct(){
        var piece = Piece();
        piece.color shouldBe Piece.WHITE_COLOR
        piece.representation shouldBe Piece.WHITE_REPRESENTATION
    }

    fun verifyPawn(color:String,representation:String) {
        var piece = Piece(color,representation)
        piece.color shouldBe color
        piece.representation shouldBe representation
    }
}