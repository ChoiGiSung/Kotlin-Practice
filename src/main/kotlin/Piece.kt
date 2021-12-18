open class Piece (){

    var color:String = ""
    var representation:String = ""

    constructor(color:String,representation:String):this(){
        this.color = color
        this.representation = representation
    }

    enum class Type(private val representation:String){
        PAWN("p"),
        KNIGHT("n"),
        ROOK("r"),
        BISHOP("b"),
        QUEEN("q"),
        KING("k"),
        NO_PIECE(".");

        fun getWhiteRepresentation() = representation
        fun getBlackRepresentation() = representation.uppercase()
    }


    companion object{
        const val BLACK_COLOR = "Black"
        const val WHITE_COLOR = "White"

        fun createBlackPawn():Piece = Piece(BLACK_COLOR,Type.PAWN.getWhiteRepresentation())
        fun createWhitePawn():Piece = Piece(WHITE_COLOR,Type.PAWN.getBlackRepresentation())

        fun createBlackKnight():Piece = Piece(BLACK_COLOR,Type.KNIGHT.getWhiteRepresentation())
        fun createWhiteKnight():Piece = Piece(WHITE_COLOR,Type.KNIGHT.getBlackRepresentation())

        fun createBlackRook():Piece = Piece(BLACK_COLOR,Type.ROOK.getWhiteRepresentation())
        fun createWhiteRook():Piece = Piece(WHITE_COLOR,Type.ROOK.getBlackRepresentation())

        fun createBlackBishop():Piece = Piece(BLACK_COLOR,Type.BISHOP.getWhiteRepresentation())
        fun createWhiteBishop():Piece = Piece(WHITE_COLOR,Type.BISHOP.getBlackRepresentation())

        fun createBlackQueen():Piece = Piece(BLACK_COLOR,Type.QUEEN.getWhiteRepresentation())
        fun createWhiteQueen():Piece = Piece(WHITE_COLOR,Type.QUEEN.getBlackRepresentation())

        fun createBlackKing():Piece = Piece(BLACK_COLOR,Type.KING.getWhiteRepresentation())
        fun createWhiteKing():Piece = Piece(WHITE_COLOR,Type.KING.getBlackRepresentation())

        fun createNoPiece():Piece = Piece(".",Type.NO_PIECE.getBlackRepresentation())
    }

    fun isWhite() = this.color == WHITE_COLOR
    fun isBlack() = this.color == BLACK_COLOR


}
