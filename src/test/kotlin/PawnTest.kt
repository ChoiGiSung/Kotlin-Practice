import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec

class PawnTest : AnnotationSpec(){

    @Test
    fun test(){
        verifyPawn("black")
        verifyPawn("white")
    }

    fun verifyPawn(color:String) {
        var pawn = Pawn(color)
        pawn.color shouldBe color
    }
}