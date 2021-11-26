package service.moveValidators;

import models.PieceType;

public class MoveValidatorFactory {

    PieceMoveValidator getValidatorForPieceType(PieceType type) {
        switch (type) {
            case KING:
                return new KingMoveValidator();
            case QUEEN:
                return new QueenMoveValidator();
        };

        return null;
    }
}

// SRP: Single Reposibility Principle
// King _. it is storing properties of a king
/// how to validate a move