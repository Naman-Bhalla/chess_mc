package dtos;

import models.Board;
import models.GameStatus;
import models.Player;

public class PlayerControllerResponseDto {
    String message;
    Board boardAfterMove;
    GameStatus status; // DRAW, WON, OVER
    Player nextPlayer;
		public PlayerControllerResponseDto(String message, Board boardAfterMove, GameStatus status, Player nextPlayer) {
			this.message = message;
			this.boardAfterMove = boardAfterMove;
			this.status = status;
			this.nextPlayer = nextPlayer;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public Board getBoardAfterMove() {
			return boardAfterMove;
		}
		public void setBoardAfterMove(Board boardAfterMove) {
			this.boardAfterMove = boardAfterMove;
		}
		public GameStatus getStatus() {
			return status;
		}
		public void setStatus(GameStatus status) {
			this.status = status;
		}
		public Player getNextPlayer() {
			return nextPlayer;
		}
		public void setNextPlayer(Player nextPlayer) {
			this.nextPlayer = nextPlayer;
		}
}
