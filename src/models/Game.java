package models;

import java.util.Date;
import java.util.List;

public class Game extends BaseModel {
    private List<Player> players;
    private GameStatus status;
    private Date startTime;
}
