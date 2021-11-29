package models;

public class Piece extends BaseModel {
  Colour colour;
  PieceType pieceType;
  public Piece(Colour colour, PieceType pieceType) {
		super();
    this.colour = colour;
    this.pieceType = pieceType;
  }
  public Colour getColour() {
    return colour;
  }
  public void setColour(Colour colour) {
    this.colour = colour;
  }
  public PieceType getPieceType() {
    return pieceType;
  }
  public void setPieceType(PieceType pieceType) {
    this.pieceType = pieceType;
  }
}
