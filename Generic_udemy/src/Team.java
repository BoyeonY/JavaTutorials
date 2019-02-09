import java.util.ArrayList;


public class Team <T extends Player> implements Comparable<Team<T>>{
	
	private String name;
	int tied = 0;
	int won = 0;
	int lost = 0;
	int played = 0;
	
	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	private ArrayList<T> members = new ArrayList<>();
	
	public boolean addPlayer(T player) {
		
		if(members.contains(player)) {
			System.out.println(player.getName()+"is already on this team");
			return false;
		}else {
			System.out.println(player.getName()+"picked for team" + this.name);
			members.add(player);
			return true;
		}	
	}
	
	public int numPlayers() {
		return members.size();
	}
	
	public void matchResult(Team<T> opponent, int ourScore, int opponentScore) {
		String message;
		if(ourScore>opponentScore) {
			won++;
			message = "beat";
		}else if(ourScore<opponentScore) {
			lost++;
			message = "lost to";
		}else {
			tied++;
			message = "drew with";
		}
		played++;
		if(opponent != null) {
			System.out.println(this.getName() +message+ opponent.getName());
			opponent.matchResult(null, ourScore, opponentScore);
		}
	}
	public int ranking() {
		return (won * 2) + tied;
	}

	@Override
	public int compareTo(Team<T> team) {
		if(this.ranking() > team.ranking()) {
			return -1;
		}else if(this.ranking() < team.ranking()) {
			return 1;
		}else {
			return 0;
		}
		
	}
	
	
}
