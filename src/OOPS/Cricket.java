package OOPS;

public class Cricket {
    String Name;
    int age;
    String Team;
    int totalRuns = 0;
    String Role;
    int matchesPlayed = 0;
    double average = 0.0;

    public Cricket(String Name,int age,String Team,String Role){
        this.Name = Name;
        this.age = age;
        this.Team = Team;
        this.totalRuns = 0;
        this.Role = Role;
        this.average = average;
    }

    public void addRuns(int Runs){
        totalRuns += Runs;
        System.out.println("The Total Runs Scored by "+ Name + " " + totalRuns + " For " + Team);
    }

    public void displayInfo(){
        System.out.println("Matches: " + matchesPlayed);
        System.out.println("Player Name: " + Name);
        System.out.println("Age: " + age);
        System.out.println("Team: " + Team);
        System.out.println("Runs: " + totalRuns);
        System.out.println("Average: " + average);
        System.out.println("Role: " + Role);
    }

    public void playMatch(int runsScored){
        matchesPlayed = matchesPlayed+1;
        totalRuns = totalRuns + runsScored;
        average = totalRuns / matchesPlayed;

    }
}
