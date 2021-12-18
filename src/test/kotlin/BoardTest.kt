import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec

class BoardTest :AnnotationSpec(){

    @Test
    fun pieceCount(){
        var board = Board()
        board.initialize()

        board.pieceCount() shouldBe 16

    }

}
