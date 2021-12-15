class Board (var pawns: ArrayList<Pawn>){


    fun size() = pawns.size

    fun findPawn(index: Int) = pawns.get(index)

    fun addPawn(pawn : Pawn){
        pawns.add(pawn)
    }
}
