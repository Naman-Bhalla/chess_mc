package service;

import controllers.PlayerController;
import dtos.PlayerControllerRequestDto;
import dtos.PlayerControllerResponseDto;
import models.Colour;
import models.Game;
import models.Player;
import repositories.InMemoryPlayerRepository;
import repositories.PlayerRepository;

public class PlayerService {
		PlayerRepository playerRepository;
		Boolean shouldIdBeOne;

    public PlayerService() {
			this.playerRepository = InMemoryPlayerRepository.getInstance();
			this.shouldIdBeOne = false;
		}

		public Player getPlayerFromId(Integer playerId) {
        return playerRepository.get(playerId);
    }

    public Game getGameForPlayer(Player player) {
        return player.getGame();
    }

    public Player getPlayer(Colour colour) {
        UserService userService = new UserService();
				shouldIdBeOne = !shouldIdBeOne;
				long id = shouldIdBeOne ? 1 : 2;
        Player player = new Player(id, colour, userService.getRandomUser());
				return player;
    }

		public void save(Player player) {
			playerRepository.save(player);
		}
}
