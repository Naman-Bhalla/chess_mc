package repositories;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import models.Colour;
import models.Player;
import models.User;

public class InMemoryPlayerRepository implements PlayerRepository {
	private static InMemoryPlayerRepository instance = null; 
	HashMap<Integer, Player> player;

	private InMemoryPlayerRepository() {
		this.player = new HashMap<>();
		// Player playerOne = new Player(1, Colour.WHITE, new User("User One", "Address One", "user.one@email.in"));
		// playerOne.setId(1);
		// Player playerTwo = new Player(2, Colour.BLACK, new User("User Two", "Address Two", "user.two@email.in"));
		// playerTwo.setId(2);
		// this.player.put(1, playerOne);
		// this.player.put(2, playerTwo);
	}

	public static InMemoryPlayerRepository getInstance() {
		if(instance == null) 
			instance = new InMemoryPlayerRepository();
		return instance;
	}

	public Player get(Integer playerId) {
		return player.get(playerId);
	}

	public void save(Player playertoBeSaved) {
		long playerId = playertoBeSaved.getId();
		player.put((int)playerId, playertoBeSaved);
	}
}
