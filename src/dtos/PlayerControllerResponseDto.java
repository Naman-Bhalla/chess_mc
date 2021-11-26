package dtos;

import models.Board;
import models.GameStatus;
import models.Player;

public class PlayerControllerResponseDto {
    String message;
    Board boardAfterMove;
    GameStatus status; // DRAW, WON, OVER
    Player nextPlayer;
}
