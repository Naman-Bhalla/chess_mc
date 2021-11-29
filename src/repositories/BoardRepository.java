package repositories;

import models.Board;

public interface BoardRepository {
  Board get(int size);
}
