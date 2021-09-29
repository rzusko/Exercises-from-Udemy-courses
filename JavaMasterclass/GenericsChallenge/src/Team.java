

public abstract class Team implements Comparable<Team> {

    private String name;
    protected int played = 0;
    protected int wins = 0;
    protected int loses = 0;
    protected int ties = 0;

    public Team(String name) {
        this.name = name;
    }

    public int getPlayed() {
        return played;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public int getTies() {
        return ties;
    }

    public String getName() {
        return name;
    }

    public abstract int ranking();

    public String matchResult(int thisTeamScore, int opponentScore) {
        String message;
        this.played++;

        if (thisTeamScore > opponentScore) {
            this.wins++;
            message = " won against ";
        } else if (thisTeamScore < opponentScore) {
            this.loses++;
            message = " lost against ";
        } else {
            this.ties++;
            message = " drew with ";
        }

        return message;
    }

    @Override
    public int compareTo(Team opponent) {
        if (this.ranking() > opponent.ranking()) {
            return -1;
        } else if (this.ranking() < opponent.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
