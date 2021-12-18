open class Piece (){

    var color:String = ""
    var name:String = ""

    constructor(color:String,name:String):this(){
        this.color = color
        this.name = name
    }


    companion object{
        const val BLACK_COLOR = "Black"
        const val WHITE_COLOR = "White"
        const val BLACK_REPRESENTATION = "B"
        const val WHITE_REPRESENTATION = "W"

        fun createBlackPawn():Piece = Piece(BLACK_COLOR,"Pawn")
        fun createWhitePawn():Piece = Piece(WHITE_COLOR,"Pawn")

        fun createBlackKnight():Piece = Piece(BLACK_COLOR,"Knight")
        fun createWhiteKnight():Piece = Piece(WHITE_COLOR,"Knight")

        fun createBlackRook():Piece = Piece(BLACK_COLOR,"Rook")
        fun createWhiteRook():Piece = Piece(WHITE_COLOR,"Rook")

        fun createBlackBishop():Piece = Piece(BLACK_COLOR,"Bishop")
        fun createWhiteBishop():Piece = Piece(WHITE_COLOR,"Bishop")

        fun createBlackQueen():Piece = Piece(BLACK_COLOR,"Queen")
        fun createWhiteQueen():Piece = Piece(WHITE_COLOR,"Queen")

        fun createBlackKing():Piece = Piece(BLACK_COLOR,"king")
        fun createWhiteKing():Piece = Piece(WHITE_COLOR,"king")

        fun createNoPiece():Piece = Piece(".",".")
    }

    fun isWhite() = this.color == WHITE_COLOR
    fun isBlack() = this.color == BLACK_COLOR


}
