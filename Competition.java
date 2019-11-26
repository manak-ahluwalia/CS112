public class Competition {
	String winningTeam;
	String runnerUp;
	String name;
	int year;

	public Competition() {
		this.winningTeam = "";
		this.runnerUp = "";
		this.name = "";
		this.year = 0;
	}
	public Competition(String wt, String ru, String n, int yr) {
		this.winningTeam = wt;
		this.runnerUp = ru;
		this.name = n;
		this.year = yr;
	}
	public void setWinningTeam(String wt) {
		this.winningTeam = wt;
	}
	public String getWinningTeam() {
		return this.winningTeam;
	}
	public void setRunnerUp(String ru) {
		this.runnerUp = ru;
	}
	public String getRunnerUp() {
		return this.runnerUp;
	}
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return this.name;
	}
	public void setYear(int y) {
		this.year = y;
	}
	public int getYear() {
		return this.year;
	}
	public String toString() {
		String output = "";
		output += "Competition Name: " + getName();
		output += "\nYear: " + getYear();
		output += "\nWinning Team: " + getWinningTeam();
		output += "\nRunner Up: " + getRunnerUp();
		return output;
	}
}