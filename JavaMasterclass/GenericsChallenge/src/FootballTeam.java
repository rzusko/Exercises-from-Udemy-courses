public class FootballTeam extends Team {

    public FootballTeam(String name) {
        super(name);
    }

//    public int compareTo(FootballTeam opponent) {
//        return super.compareTo(opponent);
//    }

    public void matchResult(FootballTeam opponent, int thisTeamScore, int opponentScore) {
        String message = super.matchResult(thisTeamScore, opponentScore);

        if (opponent != null) {
            opponent.matchResult(opponentScore, thisTeamScore);
            System.out.println(this.getName() + message + opponent.getName());
        }
    }

    @Override
    public int ranking() {
        return (this.wins * 2) + ties;
    }
}
