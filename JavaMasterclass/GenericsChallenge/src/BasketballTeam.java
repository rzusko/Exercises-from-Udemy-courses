public class BasketballTeam extends Team{

    public BasketballTeam(String name) {
        super(name);
    }

//    public int compareTo(BasketballTeam opponent) {
//        return super.compareTo(opponent);
//    }

    public void matchResult(BasketballTeam opponent, int thisTeamScore, int opponentScore) {
        String message = super.matchResult(thisTeamScore, opponentScore);

        if (opponent != null) {
            opponent.matchResult(opponentScore, thisTeamScore);
            System.out.println(this.getName() + message + opponent.getName());
        }
    }

    @Override
    public int ranking() {
        return wins;
    }
}
