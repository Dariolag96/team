import java.util.ArrayList;

public class Team {
    private String nameTeam;
    private int numberOfPlayer;
    private ArrayList<Player> players;

    public Team(String nameTeam){
        this.nameTeam=nameTeam;
        numberOfPlayer=0;
        this.Players=new ArrayList<>();
    }
    public void addPlayer(Player player){
        Players.add(Player);
        this.numberOfPlayers++;
    }
    public ArrayList <Player> findPlayersByName (String name){
        ArrayList <Player> foundPlayer = new ArrayList<>();
        for (   Player p: Players){
            if (p.name.equalsIgnoreCase(name)){
                foundPlayer.add(p);
            }
        }
        /*Metodi per trovare i giocatori con le caratteristiche corrispondenti*/

        return foundPlayer;
    }

    }
    public ArrayList <Player> findPlayersByRole (String role){
        ArrayList <Player> foundPlayer = new ArrayList<>();

        return foundPlayer;
}
