/**
* The SportsTeam class defines a specific sort of extracurricular activity,
* namely (obviously), sports teams. This class holds the information specific to
* those extracurricular activities that are sports.
*/
public class SportsTeam extends ExtraCurricularActivity {
    private String nextThreeGames;
    private String homeOrAway;
    private String mascot;

    /**
    * setNextThreeGames makes the private string describing the dates of
    * upcoming games publicly-modifiable.
    * @param dates of the next three games.
    */
    public void setNextThreeGames(String nextThreeGames) {
      this.nextThreeGames = nextThreeGames;
    }

    /**
    * getNextThreeGames makes the private string describing the dates of
    * upcoming games publicly-accessible.
    * @return dates of the next three gmes
    */
    public String getNextThreeGames() {
      return nextThreeGames;
    }

    /**
    * setHomeOrAway makes the private string indicating whether those three games
    * are going to be at home or away, publicly-modifiable
    * @param locations of the next three games
    */
    public void setHomeOrAway(String homeOrAway) {
      this.homeOrAway = homeOrAway;
    }

    /**
    * getHomeOrAway makes the private string of game locations publicly-accessible
    * @return locations of the next three games
    */
    public String getHomeOrAway() {
      return homeOrAway;
    }

    /**
    * setMascot makes the private mascot string publicly-modifiable
    * @param mascot name
    */
    public void setMascot(String mascot) {
      this.mascot = mascot;
    }

    /**
    * getMascot makes the private mascot string publicly-viewable
    * @return mascot name
    */
    public String getMascot() {
      return mascot;
    }

    /**
    * toString replaces the default location / pointer information
    *  @return information about the next three games 
    */
    public String toString() {
       return super.toString()
        + "\nNext three games: " + nextThreeGames
        + "\nAre games home or away: " + homeOrAway
        + "\nTeam mascot: " + mascot;
    }
}
