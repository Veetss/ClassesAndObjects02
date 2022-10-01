public class Competition {

    public static void main(String[] args) {
        CompetitionRules competitionRules = CompetitionRules.getInstance();
        CompetitionRules regole = new CompetitionRules();
        competitionRules.printRules();

        Team teamA = new Team();
        teamA.teamName = "Nani da battaglia";
        Team teamB = new Team();
        teamB.teamName = "Coffee addict";

        teamA.p1.yearsOfExperience = 3;
        teamA.p1.name = "Marcello ";
        teamA.p1.programmingLanguage = "JavaScript ";

        teamA.p2.yearsOfExperience = 10;
        teamA.p2.name = "MariaSole ";
        teamA.p2.programmingLanguage = "JavaScript ";

        teamB.p1.yearsOfExperience = 2;
        teamB.p1.name = "Cane ";
        teamB.p1.programmingLanguage = "Java ";

        teamB.p2.yearsOfExperience = 11;
        teamB.p2.name = "Paolo ";
        teamB.p2.programmingLanguage = "Java ";

        teamA.printTeamDetails();
        teamB.printTeamDetails();
    }
}