class Board{

    private var pawns: ArrayList<Pawn> = arrayListOf()

    fun size() = pawns.size

    fun findPawn(index: Int) = pawns[index]

    fun addPawn(pawn : Pawn){
        pawns.add(pawn)
    }
}
