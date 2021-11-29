package repositories;

import java.util.ArrayList;

import db.boardDb;
import models.Board;

public class InMemoryBoardRepository implements BoardRepository {
    private ArrayList<Board> board;
    public InMemoryBoardRepository() {
      this.board = boardDb.connect();
    }

    @Override
    public Board get(int size) {
      return board.get(size);
    }
}
