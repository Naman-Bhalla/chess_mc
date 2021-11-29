package controllers;

import dtos.PlayerControllerRequestDto;
import dtos.PlayerControllerResponseDto;
import models.Board;
import models.Game;
import models.GameStatus;
import models.Player;
import service.BoardService;
import service.PlayerService;
import service.moveValidators.MoveValidatorService;

public class PlayerController {
    PlayerService playerService = new PlayerService();
    BoardService boardService = new BoardService();
    MoveValidatorService moveValidatorService =
            new MoveValidatorService();

    public PlayerControllerResponseDto makeMove(
            PlayerControllerRequestDto request
    ) {
        Player player = playerService.getPlayerFromId(request.getPlayerId());
        Game game = playerService.getGameForPlayer(player);
        Board board = boardService.getBoardForGame(game);
        if (moveValidatorService.validateMove(
                board,
                request.getStartCell(),
                request.getEndCell()
        )) {
            // doesn't include attacks to opponent players
						// only move feature implemented, same player keeps moving for now
						String message = player.getColour() + " moves " + request.getStartCell().toString() + " to " + request.getEndCell().toString();
						board.movePiece(request.getStartCell(), request.getEndCell());
						System.out.println("\n\n");
						System.out.println("new board : ");
						board.printBoard();
						return new PlayerControllerResponseDto(message, board, GameStatus.ACTIVE, player);
        }
				System.out.println("\n\n");
				System.out.println("new board : \n");
				board.printBoard();
        return new PlayerControllerResponseDto("Invalid move", board, GameStatus.ACTIVE, player);
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
