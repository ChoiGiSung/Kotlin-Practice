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

        fun createBlackPawn():Piece = createPiece(BLACK_COLOR,Type.PAWN.getWhiteRepresentation())
        fun createWhitePawn():Piece = createPiece(WHITE_COLOR,Type.PAWN.getBlackRepresentation())

        fun createBlackKnight():Piece = createPiece(BLACK_COLOR,Type.KNIGHT.getWhiteRepresentation())
        fun createWhiteKnight():Piece = createPiece(WHITE_COLOR,Type.KNIGHT.getBlackRepresentation())

        fun createBlackRook():Piece = createPiece(BLACK_COLOR,Type.ROOK.getWhiteRepresentation())
        fun createWhiteRook():Piece = createPiece(WHITE_COLOR,Type.ROOK.getBlackRepresentation())

        fun createBlackBishop():Piece = createPiece(BLACK_COLOR,Type.BISHOP.getWhiteRepresentation())
        fun createWhiteBishop():Piece = createPiece(WHITE_COLOR,Type.BISHOP.getBlackRepresentation())

        fun createBlackQueen():Piece = createPiece(BLACK_COLOR,Type.QUEEN.getWhiteRepresentation())
        fun createWhiteQueen():Piece = createPiece(WHITE_COLOR,Type.QUEEN.getBlackRepresentation())

        fun createBlackKing():Piece = createPiece(BLACK_COLOR,Type.KING.getWhiteRepresentation())
        fun createWhiteKing():Piece = createPiece(WHITE_COLOR,Type.KING.getBlackRepresentation())

        fun createNoPiece():Piece = createPiece(".",Type.NO_PIECE.getBlackRepresentation())

        private fun createPiece(color: String,type: String) = Piece(color,type)

    }

    fun isWhite() = this.color == WHITE_COLOR
    fun isBlack() = this.color == BLACK_COLOR


}
