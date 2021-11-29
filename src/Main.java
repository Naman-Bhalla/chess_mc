import controllers.PlayerController;
import dtos.PlayerControllerRequestDto;
import dtos.PlayerControllerResponseDto;
import models.Colour;
import models.Game;
import models.GameStatus;
import models.Player;
import repositories.InMemoryBoardRepository;
import repositories.InMemoryUserRepository;
import repositories.UserRepository;
import service.BoardService;
import service.PlayerService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PlayerService playerService = new PlayerService();
				BoardService boardService = new BoardService();
        Player player1 = playerService.getPlayer(Colour.WHITE);
        Player player2 = playerService.getPlayer(Colour.BLACK);

        Game game1 = new Game();

        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        game1.setPlayers(players);
				player1.setGame(game1);
				player2.setGame(game1);
				playerService.save(player1);
				playerService.save(player2);
				game1.setBoard(boardService.setNewBoard(8));
        game1.setStatus(GameStatus.ACTIVE);

        PlayerController playerController = new PlayerController();
				game1.getBoard().printBoard();
				// RIGHT KING MOVE
        PlayerControllerResponseDto response = playerController.makeMove(new PlayerControllerRequestDto(1, game1.getBoard().getCell(0, 0), game1.getBoard().getCell(1, 1)));
				System.out.println(response.getMessage());
				// WRONG KING MOVE
				PlayerControllerResponseDto response1 = playerController.makeMove(new PlayerControllerRequestDto(1, game1.getBoard().getCell(1, 1), game1.getBoard().getCell(3, 1)));
				System.out.println(response1.getMessage());
    }
}

// Assignment
// Implement the places where null is
// Make service use repository
