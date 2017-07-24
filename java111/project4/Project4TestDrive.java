import java.util.*;
/**
* Java Project 4
* @author Nicole Steck 
* The TestDrive class instantiates and runs the relevant objects and methods,
* and makes the whole thing go.
*
*/
public class Project4TestDrive {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------");
        System.out.println("BEGIN PART ONE");

        GameSchedule scheduledTeams = new GameSchedule();

        ArrayList<SportsTeam> theTeams = new ArrayList<SportsTeam>();

        SportsTeam lacrosse = new SportsTeam();
        lacrosse.setName("lacrosse");
        lacrosse.setLead("Sr. La Croix");
        lacrosse.setNumberOfStudents(15);
        lacrosse.setNextThreeGames("4/22, 4/27, 5/2");
        lacrosse.setHomeOrAway("home, home, away");
        lacrosse.setMascot("Tiggy the Tiger");
        theTeams.add(lacrosse);
        scheduledTeams.addTeam(lacrosse);

        SportsTeam rugby = new SportsTeam();
        rugby.setName("rugby");
        rugby.setLead("Ms. Marshall");
        rugby.setNumberOfStudents(22);
        rugby.setNextThreeGames("4/13, 4/19, 4/22");
        rugby.setHomeOrAway("away, away, away");
        rugby.setMascot("Liggy the Liger");
        theTeams.add(rugby);
        scheduledTeams.addTeam(rugby);

        SportsTeam soccer = new SportsTeam();
        soccer.setName("soccer");
        soccer.setLead("Mr. Wallace");
        soccer.setNumberOfStudents(523);
        soccer.setNextThreeGames("4/28, 5/15, 5/21");
        soccer.setHomeOrAway("home, home, home");
        soccer.setMascot("Ziggy the Ziger");
        theTeams.add(soccer);
        scheduledTeams.addTeam(soccer);



        System.out.println(scheduledTeams.display());


        // BEGINNING OF PART 2 !!!!!!!!!!!!!!!


        System.out.println("\n\n---------------------------------------------------");
        System.out.println("BEGIN PART TWO");

        StudentTranscripts theTranscripts = new StudentTranscripts();

        HighSchoolStudent emoKid = new HighSchoolStudent();
        emoKid.setName("Jill Peters");
        emoKid.setId(1);
        emoKid.setSchoolName("Ronald McDonald High School");
        emoKid.setHomeroomTeacher("Walter White");
        emoKid.setExtracurricularActivities("Skiing, Extreme Lethargy");
        emoKid.setGpa("3.8");
        emoKid.setHasVarsityLetter(false);
        theTranscripts.addStudent(emoKid);

        MiddleSchoolStudent soPunkRock = new MiddleSchoolStudent();
        soPunkRock.setName("Michael Meyers");
        soPunkRock.setId(2);
        soPunkRock.setSchoolName("Joseph McGerbil Middle School for the Musically Gifted");
        soPunkRock.setHomeroomTeacher("Jack Black");
        soPunkRock.setExtracurricularActivities("Guitar, Jumprope");
        soPunkRock.setGpa("3.5");
        soPunkRock.setTakenPSAT(true);
        theTranscripts.addStudent(soPunkRock);

        MiddleSchoolStudent tooCool = new MiddleSchoolStudent();
        tooCool.setName("Johnny Appleseed");
        tooCool.setId(3);
        tooCool.setSchoolName("Joseph McGerbil Middle School for the Super Awesome");
        tooCool.setHomeroomTeacher("Bernie Sanders");
        tooCool.setExtracurricularActivities("Volunteering at shelters");
        tooCool.setGpa("4.0");
        tooCool.setTakenPSAT(true);
        theTranscripts.addStudent(tooCool);

        ElementarySchoolStudent lovesPuppies = new ElementarySchoolStudent();
        lovesPuppies.setName("Ayle Hibou");
        lovesPuppies.setId(4);
        lovesPuppies.setSchoolName("Carrot Top's House of Early Schoolin'");
        lovesPuppies.setHomeroomTeacher("Apparently, a large carrot");
        lovesPuppies.setExtracurricularActivities("Playing with puppies");
        lovesPuppies.setGpa("3.0");
        lovesPuppies.setIsLiterate(true);
        theTranscripts.addStudent(lovesPuppies);

        ElementarySchoolStudent hatesAlphabets = new ElementarySchoolStudent();
        hatesAlphabets.setName("Orrin Hatch");
        hatesAlphabets.setId(5);
        hatesAlphabets.setSchoolName("Education Station, What's Your Motivation?");
        hatesAlphabets.setHomeroomTeacher("Claire Malone");
        hatesAlphabets.setExtracurricularActivities("Setting off fire alarms");
        hatesAlphabets.setGpa("2.1");
        hatesAlphabets.setIsLiterate(false);
        theTranscripts.addStudent(hatesAlphabets);

        theTranscripts.printTranscripts();

        // BEGINNING OF PART THREE ***********************************************

        System.out.println("\n\n--------------------------------------------------------");
        System.out.println("BEGIN PART THREE");
        BadgeReader badgeReader = new BadgeReader();

        Principal thePrinc = new Principal();

        System.out.println("\n\n_____________________________________");
        System.out.println("\nCan the Principal go places?");
        if (thePrinc.allowEntry("highSchool")) {
            System.out.println("\n\nThe Principal is in the high school.");
        } else {
            System.out.println("\n\nWhy wasn't the Principal allowed into"
                    + " the high school??");
        }

        if (thePrinc.allowEntry("footballField")) {
            System.out.println("\n\nThe Principal is on the football field.");
        } else {
            System.out.println("\n\nWhy wasn't the Principal allowed onto"
                    + " the fields? Is the Principal not cool enough??");
        }

        MiddleSchoolStudent middleSchooler = new MiddleSchoolStudent();

        System.out.println("\n\n_____________________________________");
        System.out.println("\nCan a middle school student go places?");

        if (middleSchooler.allowEntry("highSchool")) {
            System.out.println("\n\nThe middle schooler is in the high school."
                    + " That seems like a bad idea.");
        } else {
            System.out.println("\n\nYeah, you DON'T get to go in there yet, "
                    + "little person.  Wait 'til high school!");
        }

        HighSchoolStudent highSchooler = new HighSchoolStudent();

        System.out.println("\n\n_____________________________________");

        System.out.println("\nCan a high school student go places?");

        if (highSchooler.allowEntry("highSchool")) {
            System.out.println("\n\nThe high schooler is in the high school.");
        } else {
            System.out.println("\n\nWhy wasn't the high schooler allowed into"
                    + " the high school?? Is this kid in detention??");
        }

    /*    ElementarySchoolStudent smallChild = new ElementarySchoolStudent();

        System.out.println("\n\n_____________________________________");

        System.out.println("\nCan a tiny elementarian go places?");

        if (smallChild.allowEntry("highSchool")) {
            System.out.println("\n\nThe TINY CHILD is in the high school.");
        } else {
            System.out.println("\n\nIt's only appropriate that tiny humans "
                    + "aren't allowed in high schools.");
        } */

    }
}
