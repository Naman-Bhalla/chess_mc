package models;

public class Cell extends BaseModel {
    private Colour colour;
    private Piece piece;
		private long cellX;
		private long cellY;


    public Cell(Colour colour, Piece piece, long cellX, long cellY) {
				super();
        this.colour = colour;
        this.piece = piece;
				this.cellX = cellX;
				this.cellY = cellY;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

		public long getCellX() {
			return cellX;
		}

		public String getCellChessCoordinates() {
			return "" + (char)((int)'A' + this.getCellX()) + (int)(this.getCellY()+1);
		}

		public void setCellX(long cellX) {
			this.cellX = cellX;
		}

		public long getCellY() {
			return cellY;
		}

		public void setCellY(long cellY) {
			this.cellY = cellY;
		}

		public String toString() {
			String pieceName = piece.getColour().toString()+ " " + piece.getPieceType().toString() + " ";
			if(piece.getPieceType() == PieceType.UNKNOWN) pieceName = "";
			return pieceName + this.getCellChessCoordinates();
		}

}


// controller
// services
// repositories

// restaurant
// waiter -> controllers
// waiter goes to a chef -> service
// ingredients in fridge -> repository

// make a move
// MoveController: makeMove()
// MoveService: makeMove()
// 1. get the board for the game: BoardRepository
// 2. check if the move is valid:
// 3. update the previous cell: CellRepository
// 4. update the destination cell

// purpose of repository: fetch things from the db table
// MoveRepository: moves table
// GameRepo: games table

//