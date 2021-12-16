class Board{

    private var pawns: ArrayList<ArrayList<Pawn>> = arrayListOf()

    fun size() = pawns.size

    fun findPawn(index: Int) = pawns[index]

    fun initialize(){
        addNoPawn()
        addBlackPawn()
        addNoPawn()
        addNoPawn()
        addNoPawn()
        addNoPawn()
        addWhitePawn()
        addNoPawn()
    }

    fun print():String{
        var result= "";
        for (pawn in pawns) {
            for (p in pawn) {
                result+=p.color
            }
            result+="\n"
        }
        return result
    }

    private fun addNoPawn(){
        pawns.add(arrayListOf(NoPawn(),NoPawn(),NoPawn(),NoPawn(),NoPawn(),NoPawn(),NoPawn(),NoPawn()))
    }

    private fun addBlackPawn(){
        pawns.add(arrayListOf(Pawn("B"),Pawn("B"),Pawn("B"),Pawn("B"),Pawn("B"),Pawn("B"),Pawn("B"),Pawn("B")))
    }

    private fun addWhitePawn(){
        pawns.add(arrayListOf(Pawn("W"),Pawn("W"),Pawn("W"),Pawn("W"),Pawn("W"),Pawn("W"),Pawn("W"),Pawn("W")))
    }

}
