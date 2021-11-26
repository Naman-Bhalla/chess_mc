package dtos;

import models.Board;
import models.Cell;
import models.Player;

public class PlayerControllerRequestDto {
    long playerId; // Player -> Game
    Cell startCell;
    Cell endCell; // Cewll -> P{iece

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
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
