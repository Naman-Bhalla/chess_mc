package service.moveValidators;

import models.Board;
import models.Cell;

public interface PieceMoveValidator {
    public boolean validateMove(Board board,
                                Cell startCell,
                                Cell endCell);
}
