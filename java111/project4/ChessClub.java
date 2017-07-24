/**
*
*  The ChessClub class is a type of Academic Club, meaning it inherits from
*  the AcademicClub class.  It supplies details specific to students in the
*  Chess Club at school - specifically, who the top-rated chess player is.
*/
public class ChessClub extends AcademicClub {
    private String topRatedPlayer;

    /**
    * setTopRatedPlayer allows the private topRatedPlayer string to be
    * publicly-modifiable
    * @param the top-rated chess player
    */
    public void setTopRatedPlayer(String topRatedPlayer) {
        this.topRatedPlayer = topRatedPlayer;
    }

    /**
    * getTopRatedPlayer allows the private topRatedPlayer string to be
    * publicly-viewable
    * @return the top-rated Chess player
    */
    public String getTopRatedPlayer() {
        return topRatedPlayer;
    }
}
