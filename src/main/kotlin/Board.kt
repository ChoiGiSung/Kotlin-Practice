import utils.StringUtil

class Board {

    private var pieces: ArrayList<ArrayList<Piece>> = arrayListOf()

    fun size() = pieces.size

    fun findPawn(index: Int) = pieces[index]

    fun initialize() {
        addNoPawn()
        addBlackPawn()
        for (i in 1..4){
            addNoPawn()
        }
        addWhitePawn()
        addNoPawn()
    }

    fun print(): String {
        var result = "";
        for (pawn in pieces) {
            for (p in pawn) {
                result += p.color
            }
            result += StringUtil.NEW_LINE
        }
        println(result)
        return result
    }

    fun getWhitePawnsResult(): String {
        var result = ""
        val get = pieces.get(6)
        for (p in get) {
            result += p.color
        }
        return result
    }

    fun getBlackPawnsResult(): String {
        var result = ""
        val get = pieces.get(1)
        for (p in get) {
            result += p.color
        }
        return result
    }


    private fun addNoPawn() {
        createPieceLine(Piece.createNoPiece())
    }

    private fun addBlackPawn() {
        createPieceLine(Piece.createBlackPawn())
    }

    private fun addWhitePawn() {
        createPieceLine(Piece.createWhitePawn())
    }

    private fun createPieceLine(piece: Piece){
        val pawns = arrayListOf<Piece>()
        for (i in 1..10) {
            pawns.add(piece)
        }
        pieces.add(pawns)
    }

}
