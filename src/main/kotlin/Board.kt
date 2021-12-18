import Piece.Companion.createBlackBishop
import Piece.Companion.createBlackKing
import Piece.Companion.createBlackKnight
import Piece.Companion.createBlackQueen
import Piece.Companion.createBlackRook
import Piece.Companion.createWhiteBishop
import Piece.Companion.createWhiteKnight
import Piece.Companion.createWhiteQueen
import Piece.Companion.createWhiteRook
import utils.StringUtil

class Board {

    private var pieces: ArrayList<ArrayList<Piece>> = arrayListOf()

    fun size() = pieces.size

    fun findPawn(index: Int) = pieces[index]

    fun pieceCount():Int{
        var result = 0
        for (pieceList in pieces) {
            for (piece in pieceList) {
                if (piece.representation != "."){
                    result++
                }
            }
        }
        return result
    }

    fun initialize() {
        addBlackSpecials()
        addBlackPawn()
        for (i in 1..4){
            addNoPawn()
        }
        addWhitePawn()
        addWhiteSpecials()
    }

    private fun addBlackSpecials() {
        var list = arrayListOf(createBlackRook(), createBlackKnight(), createBlackBishop(), createBlackQueen(),
            createBlackKing(), createBlackBishop(), createBlackKnight(), createBlackRook())
        pieces.add(list)
    }

    private fun addWhiteSpecials() {
        var list = arrayListOf(createWhiteRook(), createWhiteKnight(), createWhiteBishop(), createWhiteQueen(),
            createBlackKing(), createWhiteBishop(), createWhiteKnight(), createWhiteRook())
        pieces.add(list)
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
        for (i in 0..7) {
            pawns.add(piece)
        }
        pieces.add(pawns)
    }

}
