import utils.StringUtil

class Board {

    private var pawns: ArrayList<ArrayList<Pawn>> = arrayListOf()

    fun size() = pawns.size

    fun findPawn(index: Int) = pawns[index]

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
        for (pawn in pawns) {
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
        val get = pawns.get(6)
        for (p in get) {
            result += p.color
        }
        return result
    }

    fun getBlackPawnsResult(): String {
        var result = ""
        val get = pawns.get(1)
        for (p in get) {
            result += p.color
        }
        return result
    }


    private fun addNoPawn() {
        pawns.add(arrayListOf(NoPawn(), NoPawn(), NoPawn(), NoPawn(), NoPawn(), NoPawn(), NoPawn(), NoPawn()))
    }

    private fun addBlackPawn() {
        pawns.add(arrayListOf(Pawn("B"), Pawn("B"), Pawn("B"), Pawn("B"), Pawn("B"), Pawn("B"), Pawn("B"), Pawn("B")))
    }

    private fun addWhitePawn() {
        pawns.add(arrayListOf(Pawn("W"), Pawn("W"), Pawn("W"), Pawn("W"), Pawn("W"), Pawn("W"), Pawn("W"), Pawn("W")))
    }


}
