package service.moveValidators;

import models.Board;
import models.Cell;

public class UnknownMoveValidator implements PieceMoveValidator {
    @Override
    public boolean validateMove(Board board, Cell startCell, Cell endCell) {
        return false;
    }
}
