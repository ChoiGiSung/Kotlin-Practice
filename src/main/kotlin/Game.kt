import java.util.*

class Game {

    var board = Board();

    fun gameStart(){
        board.initialize()
        board.print()

        val sc:Scanner = Scanner(System.`in`)
        while (true){
            println("입력하세요")
            val text = sc.next()
            when (text){
                "start" -> {
                    board.initialize()
                    board.print()
                }
                "end" -> {
                  break
                }
            }
        }
    }
}