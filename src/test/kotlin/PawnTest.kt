import io.kotlintest.DisplayName
import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec

class PawnTest : AnnotationSpec(){

    @Test
    fun test(){
        verifyPawn(Pawn.BLACK_COLOR,Pawn.BLACK_REPRESENTATION)
        verifyPawn(Pawn.WHITE_COLOR,Pawn.WHITE_REPRESENTATION)
    }

    @Test
    fun testDefaultConstruct(){
        var pawn = Pawn();
        pawn.color shouldBe Pawn.WHITE_COLOR
        pawn.representation shouldBe Pawn.WHITE_REPRESENTATION
    }

    fun verifyPawn(color:String,representation:String) {
        var pawn = Pawn(color,representation)
        pawn.color shouldBe color
        pawn.representation shouldBe representation
    }
}