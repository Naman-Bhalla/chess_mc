package dtos;

import models.Board;
import models.Cell;
import models.Player;

public class PlayerControllerRequestDto {
    Integer playerId; // Player -> Game
    Cell startCell;
    Cell endCell; // Cewll -> P{iece

    public PlayerControllerRequestDto(Integer playerId, Cell startCell, Cell endCell) {
			this.playerId = playerId;
			this.startCell = startCell;
			this.endCell = endCell;
		}

		public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Cell getStartCell() {
        return startCell;
    }

    public void setStartCell(Cell startCell) {
        this.startCell = startCell;
    }

    public Cell getEndCell() {
        return endCell;
    }

    public void setEndCell(Cell endCell) {
        this.endCell = endCell;
    }
}
