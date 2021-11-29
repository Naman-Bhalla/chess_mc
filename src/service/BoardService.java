package service;

import models.Board;
import models.Game;
import repositories.BoardRepository;
import repositories.InMemoryBoardRepository;

public class BoardService {
    private BoardRepository boardRepository;

		

    public BoardService() {
			this.boardRepository = new InMemoryBoardRepository();
		}

		public Board getBoardForGame(Game game) {
        return game.getBoard();
    }

		public Board setNewBoard(int size) {
				return this.boardRepository.get(8);
		}
}
