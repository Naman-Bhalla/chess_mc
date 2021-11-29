package service.moveValidators;

import models.Piece;
import models.PieceType;

public class MoveValidatorFactory {

    PieceMoveValidator getValidatorForPieceType(Piece piece) {
        PieceType type = piece.getPieceType();
        switch (type) {
            case KING:
                return new KingMoveValidator();
            case QUEEN:
                return new QueenMoveValidator();
            case UNKNOWN:
                return new UnknownMoveValidator();
        };

        return null;
    }
}

// SRP: Single Reposibility Principle
// King _. it is storing properties of a king
/// how to validate a move