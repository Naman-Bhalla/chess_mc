package service.moveValidators;

import models.Board;
import models.Cell;

public class MoveValidatorService {
    private MoveValidatorFactory moveValidatorFactory =
            new MoveValidatorFactory();

    public boolean validateMove(Board board,
                         Cell startCell,
                         Cell endCell) {
        PieceMoveValidator validator =
                moveValidatorFactory.getValidatorForPieceType(
                        startCell.getPiece()
                );
        return validator.validateMove(board, startCell, endCell);
    }
}
