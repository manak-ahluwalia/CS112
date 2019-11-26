public class CompetitionDemo {
	public static void main(String[] args) {
		Team team1 = new Team();
		team1.setTeamName("Golden State Warriors");
		team1.setName1("Stephen Curry");
		team1.setName2("Klay Thompson");
		team1.setName3("D'Angelo Russell");
		team1.setName4("Draymond Green");

		Team team2 = new Team(team1);

		Competition competition1 = new Competition();
		competition1.setWinningTeam(team1.getTeamName());
		competition1.setRunnerUp("Cleveland Cavaliers");
		competition1.setName("NBA Finals");
		competition1.setYear(2015);

		team1.setCompetition1(competition1);

		Competition competition2 = new Competition("Golden State Warriors", "Houston Rockets", "Western Conference Finals", 2017);

		team1.setCompetition2(competition2);

		System.out.println(team1);
	}
}