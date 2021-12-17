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

        fun createBlackPawn(color: String,name: String):Piece = Piece(Piece.BLACK_COLOR,"Pawn")
        fun createWhitePawn(color: String,name: String):Piece = Piece(Piece.WHITE_COLOR,"Pawn")

        fun createBlackKnight(color: String,name: String):Piece = Piece(Piece.BLACK_COLOR,"Knight")
        fun createWhiteKnight(color: String,name: String):Piece = Piece(Piece.WHITE_COLOR,"Knight")

        fun createBlackRook(color: String,name: String):Piece = Piece(Piece.BLACK_COLOR,"Rook")
        fun createWhiteRook(color: String,name: String):Piece = Piece(Piece.WHITE_COLOR,"Rook")

        fun createBlackBishop(color: String,name: String):Piece = Piece(Piece.BLACK_COLOR,"Bishop")
        fun createWhiteBishop(color: String,name: String):Piece = Piece(Piece.WHITE_COLOR,"Bishop")

        fun createBlackQueen(color: String,name: String):Piece = Piece(Piece.BLACK_COLOR,"Queen")
        fun createWhiteQueen(color: String,name: String):Piece = Piece(Piece.WHITE_COLOR,"Queen")

        fun createBlackKing(color: String,name: String):Piece = Piece(Piece.BLACK_COLOR,"king")
        fun createWhiteKing(color: String,name: String):Piece = Piece(Piece.WHITE_COLOR,"king")
    }


}