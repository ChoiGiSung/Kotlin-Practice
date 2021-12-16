import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec

class BoardTest :AnnotationSpec(){

    @Test
    fun findPawn() {
//        var board = Board()
//        board.addPawn(arrayListOf<Pawn>(Pawn("black")))
//
//        val findPawn = board.findPawn(0).get(0)
//        findPawn.color shouldBe "black"
    }

    @Test
    fun boardInit(){
        var board = Board();
        board.initialize();

        println(board.print())
    }

}