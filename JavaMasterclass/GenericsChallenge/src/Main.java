public class Main {
    // Create a generic class to implement a league table for a sport.
    // The class should allow teams to be added to the list, and store
    // a list of teams that belong to the league.
    //
    // Your class should have a method to print out the teams in order,
    // with the team at the top of the league printed first.
    //
    // Only teams of the same type should be added to any particular
    // instance of the league class - the program should fail to compile
    // if an attempt is made to add an incompatible team.

    public static void main(String[] args) {
        FootballTeam tatranPO = new FootballTeam("Tatran Presov");
        BasketballTeam goodAngelsKE = new BasketballTeam("Good Angels Kosice");
        HockeyTeam slovanBA = new HockeyTeam("Slovan Bratislava");
        HockeyTeam ussKE = new HockeyTeam("USS Kosice");
        HockeyTeam poprad = new HockeyTeam("Poprad");
        HockeyTeam dukla = new HockeyTeam("Dukla Trencin");

        League<HockeyTeam> tiposEL = new League<>("Tipos Extraliga");

        tiposEL.addTeam(slovanBA);
        tiposEL.addTeam(ussKE);
        tiposEL.addTeam(poprad);
        tiposEL.addTeam(dukla);
//        tiposEL.addTeam(tatranPO);
//        tiposEL.addTeam(goodAngelsKE);

//        tatranPO.matchResult(poprad, 7, 3);
        poprad.matchResult(slovanBA, 7, 3);
        poprad.matchResult(ussKE, 4, 3);
        poprad.matchResult(dukla, 2, 2);
        slovanBA.matchResult(ussKE, 3, 1);
        slovanBA.matchResult(dukla, 3, 9);
        ussKE.matchResult(dukla, 2, 2);

        tiposEL.printInOrder();
    }

}
