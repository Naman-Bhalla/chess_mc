package db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import models.Board;
import models.Cell;
import models.Colour;
import models.Piece;
import models.PieceType;

public class boardDb {
  public static ArrayList<Board> connect() {
    Board eightBoard = new Board(8);
    eightBoard.setCell(0, 0, new Piece(Colour.WHITE, PieceType.KING));
    eightBoard.setCell(0, 7, new Piece(Colour.BLACK, PieceType.KING));
    ArrayList<Board> board = new ArrayList<>();
    board.addAll(Arrays.asList(null, null, null, null, null, null, null, null, eightBoard));
    return board;
  }
}
