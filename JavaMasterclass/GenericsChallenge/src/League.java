import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String name;
    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public boolean addTeam(T newTeam) {
        if (this.teams.contains(newTeam)) {
            System.out.println("Team is already in league.");
            return false;
        }
        this.teams.add(newTeam);
        return true;
    }

    public void printInOrder() {
        Collections.sort(teams);
        int position = 1;
        for (T team: teams) {
            System.out.println(position++ + ". " + team.getName() + " - " + team.ranking());
        }
    }
}
