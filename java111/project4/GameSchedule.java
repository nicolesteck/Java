import java.util.*;
/**
* GameSchedule takes all of the sports teams and puts them together into one
* comprehensive schedule.
*/
public class GameSchedule {
    ArrayList<SportsTeam> scheduledTeams = new ArrayList<SportsTeam>();
        /**
        *  addTeam takes each team and adds it to the schedule
        *  @param team name
        */
        public void addTeam(SportsTeam theTeam) {
                //System.out.println("\n\n" + theTeam + "-----");
                scheduledTeams.add(theTeam);

        }
        /**
        * display prepares the schedule information to be outputted
        * @return report of teams
        */
        public String display() {
                String teamSchedule = "Report of Upcoming Games\n";
                //int iterator = 0;
                for (SportsTeam theTeam : scheduledTeams) {
                                teamSchedule += theTeam;
                                //System.out.println("iterator says " + iterator);
                                //++iterator;
                                //System.out.println("schedj" + teamSchedule);

                }

                return teamSchedule;
        }
}
