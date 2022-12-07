public class CompetitionRules {

    private static CompetitionRules competitionRules = new CompetitionRules(); //creo un oggetto di tipo competition rules, di norma non si instanzia nella classe, ma in un main perchè posso avere 10 oggetti di questo tipo. essendo instanziato come private posso accedere SOLO tramite get istance
    private String competitionRule1 = "Do not copy and paste from StackOverflow!"; //se avessi voluto accedervi dall'esterno non avrei potuto se non con un metodo public get competition blabla
    private String competitionRule2 = "Learn every day!";
    private String competitionRule3 = "Be the best team!";

    public static CompetitionRules getInstance() {
        return competitionRules;
    }

    CompetitionRules(){}

    public void printRules() {
        System.out.println(competitionRule1);
        System.out.println(competitionRule2);
        System.out.println(competitionRule3);
    }
}
