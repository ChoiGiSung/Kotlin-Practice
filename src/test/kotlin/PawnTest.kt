import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec

class PawnTest : AnnotationSpec(){

    @Test
    fun test(){
        verifyPawn(Pawn.BLACK)
        verifyPawn(Pawn.WHITE)
    }

    fun verifyPawn(color:String) {
        var pawn = Pawn(color)
        pawn.color shouldBe color
    }
}