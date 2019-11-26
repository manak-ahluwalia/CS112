public class Team {
	String teamName;
	String name1, name2, name3, name4;
	Competition competition1, competition2;

	public Team() {
		teamName = "";
		name1 = "";
		name2 = "";
		name3 = "";
		name4 = "";
		competition1 = new Competition();
		competition2 = new Competition();
	}
	public Team(String tn, String n1, String n2, String n3, String n4, Competition c1, Competition c2) {
		teamName = tn;
		name1 = n1;
		name2 = n2;
		name3 = n3;
		name4 = n4;
		competition1 = c1;
		competition2 = c2;
	}
	public Team(Team team) {
		teamName = team.getTeamName();
		name1 = team.getName1();
		name2 = team.getName2();
		name3 = team.getName3();
		name4 = team.getName4();
		competition1 = team.getCompetition1();
		competition2 = team.getCompetition2();
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String tn) {
		teamName = tn;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String n1) {
		name1 = n1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String n2) {
		name2 = n2;
	}
	public String getName3() {
		return name3;
	}
	public void setName3(String n3) {
		name3 = n3;
	}
	public String getName4() {
		return name4;
	}
	public void setName4(String n4) {
		name4 = n4;
	}
	public Competition getCompetition1() {
		return competition1;
	}
	public void setCompetition1(Competition c1) {
		competition1 = c1;
	}
	public Competition getCompetition2() {
		return competition1;
	}
	public void setCompetition2(Competition c2) {
		competition2 = c2;
	}
	public String toString() {
		String output = "";
		output += "Team Name: " + getTeamName();
		output += "\nTeam Members: " + getName1() + getName2() + getName3() + getName4();
		output += "\n" + competition1.toString();
		output += "\n" + competition2.toString();
		return output;
	}
}