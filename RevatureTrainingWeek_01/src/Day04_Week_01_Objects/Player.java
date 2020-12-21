package Day04_Week_01_Objects;

public class Player extends Person{
	private double rating;
	private Team team;
	
	public Player(int id, String name,double rating, Team team) {
		super(id, name);
		this.rating = rating;
		this.team = team;
	}
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [rating=" + rating + ", team=" + team + "]";
	}

	
	
}
