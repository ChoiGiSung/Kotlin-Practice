import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec

class BoardTest :AnnotationSpec(){

    @Test
    fun findPawn() {
        val pawns = arrayListOf(Pawn("black"))
        var board = Board(pawns);

        val findPawn = board.findPawn(0)
        findPawn.color shouldBe "black"
    }

    fun addPawn() {
    }
}