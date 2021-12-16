import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec

class BoardTest :AnnotationSpec(){

    @Test
    fun findPawn() {
        var board = Board();
        board.addPawn(Pawn("black"))

        val findPawn = board.findPawn(0)
        findPawn.color shouldBe "black"
    }

}