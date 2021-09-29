public class HockeyTeam extends Team{

    public HockeyTeam(String name) {
        super(name);
    }

//    public int compareTo(HockeyTeam opponent) {
//        return super.compareTo(opponent);
//    }

    public void matchResult(HockeyTeam opponent, int thisTeamScore, int opponentScore) {
        String message = super.matchResult(thisTeamScore, opponentScore);

        if (opponent != null) {
            opponent.matchResult(opponentScore, thisTeamScore);
            System.out.println(this.getName() + message + opponent.getName());
        }
    }

    @Override
    public int ranking() {
        return (this.wins * 3) + ties;
    }
}
