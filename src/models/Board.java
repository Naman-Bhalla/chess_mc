package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board extends BaseModel {
    private List<List<Cell>> board;
	private long size;

    public Board(long size) {
		super();
		this.size = size;
        List<List<Cell>> emptyBoard = new ArrayList<>();
        for(long cellX = 0; cellX < size; cellX++) {
			List<Cell> emptyRow = new ArrayList<>();
				for(long cellY = 0; cellY < size; cellY++) {
					Colour cellColour = cellY*cellX % 2 == 0 ? Colour.BLACK : Colour.WHITE;  
					emptyRow.add(new Cell(cellColour, new Piece(Colour.UNKNOWN, PieceType.UNKNOWN), cellX, cellY));
				}
			emptyBoard.add(emptyRow);
        }
        this.board = emptyBoard;
    }

    public Cell getCell(int cellX, int cellY) {
        return this.board.get(cellX).get(cellY);
    }

    public void setCell(int cellX, int cellY, Piece piece) {
        Cell boardCell = this.board.get(cellX).get(cellY);
        boardCell.setPiece(piece);
    }

	public Board movePiece(Cell startCell, Cell endCell) {
		Piece piece = startCell.getPiece();
		startCell.setPiece(new Piece(Colour.UNKNOWN, PieceType.UNKNOWN));
		endCell.setPiece(piece);
		return this;
	}

	public void printBoard() {
		for(int cellY = (int)size-1; cellY >= 0; cellY--) {
			for(int cellX = 0; cellX < size; cellX++) {
				Cell currentCell = this.getCell(cellX, cellY);
				System.out.print(String.format("%-20s", currentCell.toString()));
			}
			System.out.println("\n");
		}
	}
}
