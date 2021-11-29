package models;

import java.util.Date;
import java.util.List;

public class Game extends BaseModel {
    private List<Player> players;
		private Board board;
    private GameStatus status;
    private Date startTime;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

		public Board getBoard() {
			return board;
		}

		public void setBoard(Board board) {
			this.board = board;
		}
}
