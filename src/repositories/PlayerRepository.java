package repositories;

import models.Player;

public interface PlayerRepository {
	Player get(Integer playerId);
	void save(Player player);
}
