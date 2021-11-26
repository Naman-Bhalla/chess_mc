import controllers.PlayerController;
import models.Game;
import models.Player;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        Game game1 = new Game();

        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        game1.setPlayers(players);

        PlayerController playerController = new PlayerController();

        playerController.makeMove(null);
    }
}

// Assignment
// Implement the places where null is
// Make service use repository
