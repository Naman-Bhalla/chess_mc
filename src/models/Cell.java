package models;

public class Cell extends BaseModel {
    private long id;
    private Colour colour;
    private Piece piece;
    private PieceType pieceType;

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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