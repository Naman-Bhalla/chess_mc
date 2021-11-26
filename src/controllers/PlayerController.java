package controllers;

import dtos.PlayerControllerRequestDto;
import dtos.PlayerControllerResponseDto;
import models.Board;
import models.Game;
import models.Player;
import service.BoardService;
import service.PlayerService;

public class PlayerController {
    PlayerService playerService = new PlayerService();
    BoardService boardService = new BoardService();

    PlayerControllerResponseDto makeMove(
            PlayerControllerRequestDto request
    ) {
        Player player = playerService.getPlayerFromId(request.getPlayerId())
        Game game = playerService.getGameForPlayer(player);
        Board board = boardService.getBoardForGame(game);

        return playerService.makeMove();
    }
}

// Get the player from ID
// Get the game from the player
// Get the board from the game
// Validate the move
// Update the board
// Return

// succes/ failyre
// piece - cellnumber
// boolean
// valid
// board : if a move was wrong
// data transfer objects
