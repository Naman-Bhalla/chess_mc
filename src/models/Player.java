package models;

public class Player extends BaseModel {
    User user;
    Game game;
    Colour colour;
    PlayerStatus status;
    public Player(long playerId, Colour colour, User user) {
				super(playerId);
        this.user = user;
        this.colour = colour;
    }
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public Game getGame() {
			return game;
		}
		public void setGame(Game game) {
			this.game = game;
		}
		public Colour getColour() {
			return colour;
		}
		public void setColour(Colour colour) {
			this.colour = colour;
		}
		public PlayerStatus getStatus() {
			return status;
		}
		public void setStatus(PlayerStatus status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Player [colour=" + colour + ", game=" + game + ", status=" + status + ", user=" + user + "]";
		}
    
}
