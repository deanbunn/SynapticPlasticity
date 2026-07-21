package edu.team5458;

//Importing Required Packages
import java.util.ArrayList;
import com.giroux.energy.GE500; //Importing Only the One Required Class
import com.horel.solutions.*; //Importing All Classes in Package

import edu.team5458.FRCTeamMember.TeamPrimaryGroup;
import edu.team5458.FRCTeamStudent.YearInSchool;

public class FRCTeam 
{

    //Properties for Class
    public int Team_Number = 0;
    public String Team_Name = "";

    public FRCTeam()
    {
        
    }

    public FRCTeam(String teamName, String teamNumber)
    {
        //Set Team Name and Number When Initializing FRC Team Object
        this.Team_Name = teamName;
        this.Team_Number = Integer.parseInt(teamNumber);
    }

    public void DisplayTeamNameAndNumber()
    {
        //Print Out Team Name and Number
        System.out.println("\nTeam Name: " + this.Team_Name);
        System.out.println("Team Number: " + this.Team_Number + "\n");

    }

    public void DisplayTeam()
    {
        //Display the Team Name and Number
        DisplayTeamNameAndNumber();

        //Display Students
        for(FRCTeamStudent frcstudent : LoadStudents())
        {
            System.out.println("Student: " + frcstudent.getName());
            System.out.println("Primary Group: " + frcstudent.getPrimaryGroup());
            frcstudent.CheerForTeam("Whoot whoot. Let's Go 5458!");
            System.out.println("\n");
        }

        //Display Mentors
        for(FRCTeamMentor frcmentor : LoadMentors())
        {
            System.out.println("Mentor: " + frcmentor.getName());
            System.out.println("Primary Group: " + frcmentor.getPrimaryGroup());
            frcmentor.CheerForTeam("Whoot whoot. Let's Go 5458!");
            System.out.println("\n");
        }
        
    }

    public ArrayList<FRCTeamStudent> LoadStudents()
    {
        //Initialize ArrayList to Return
        ArrayList<FRCTeamStudent> lStudents = new ArrayList<>();

        //Initialize Students
        FRCTeamStudent studentGiovan = new FRCTeamStudent("Giovan", 3, TeamPrimaryGroup.programming,YearInSchool.fourth_year);
        FRCTeamStudent studentPoppy = new FRCTeamStudent("Poppy", 3, TeamPrimaryGroup.programming, YearInSchool.fourth_year);
        FRCTeamStudent studentDaniel = new FRCTeamStudent("Daniel", 2, TeamPrimaryGroup.programming, YearInSchool.third_year);
        FRCTeamStudent studentYosan = new FRCTeamStudent("Yosan", 3, TeamPrimaryGroup.mechanical, YearInSchool.fourth_year);
        FRCTeamStudent studentOlana = new FRCTeamStudent("Olana",3,TeamPrimaryGroup.mechanical,YearInSchool.fourth_year);
        FRCTeamStudent studentVicky = new FRCTeamStudent("Vicky",2,TeamPrimaryGroup.business,YearInSchool.second_year);

        //Add Student to ArrayList
        lStudents.add(studentGiovan);
        lStudents.add(studentPoppy);
        lStudents.add(studentDaniel);
        lStudents.add(studentYosan);
        lStudents.add(studentOlana);
        lStudents.add(studentVicky);

        return lStudents;
    }

    public ArrayList<FRCTeamMentor> LoadMentors()
    {
        //Initialize ArrayList to Return
        ArrayList<FRCTeamMentor> lMentors = new ArrayList<>();

        //Initialize Mentors
        FRCTeamMentor mentorWatts = new FRCTeamMentor("Watts", 9, TeamPrimaryGroup.mechanical, true);
        FRCTeamMentor mentorMark = new FRCTeamMentor("Mark", 11, TeamPrimaryGroup.business, true);
        FRCTeamMentor mentorKate = new FRCTeamMentor("Kate", 11,TeamPrimaryGroup.business, true);
        FRCTeamMentor mentorMike = new FRCTeamMentor("Mike", 4,TeamPrimaryGroup.programming, true);
        FRCTeamMentor mentorDean = new FRCTeamMentor("Dean", 4, TeamPrimaryGroup.programming, true);

        lMentors.add(mentorWatts);
        lMentors.add(mentorMark);
        lMentors.add(mentorKate);
        lMentors.add(mentorMike);
        lMentors.add(mentorDean);

        return lMentors;
    }

    public void ShowShop()
    {
        //Display the Team Name and Number
        DisplayTeamNameAndNumber();

        //
        //
        //  Put More Stuff Here
        //
        //

        //Print Out All the HS900 Device Names
        for(HS900 hs900 : LoadHS900s())
        {
            System.out.println("HS900: " + hs900.Device_Name);
        }

        //Print Blank Line for Readability
        System.out.println(" ");

        //Initialize Object Using Builder (If Class has one)
        HS1200 phsShop_HS1200 = HS1200.builder()
            .product_id("BM67CVFD32")
            .device_name("PHS Super Cutter")
            .firmware_version(23)
            .support_tier(3)
            .build();
        
        //Print Support Information
        System.out.println(phsShop_HS1200.getSupportInfo());
    
        //Change Support Tier
        phsShop_HS1200.setSupportTier(6);

        //Print HS1200 Information
        System.out.println(phsShop_HS1200.getSupportInfo());
        
        
    }

    public GE500 GetGE500()
    {

        //Initialize Giroux Device Instance
        GE500 phsShop_GE500 = new GE500();
        phsShop_GE500.Serial_Number = "XG21ZKBN97S";
        phsShop_GE500.Firmware_Version = 2.57;

        return phsShop_GE500;

    }

    public ArrayList<HS900> LoadHS900s()
    {

        //Initialize List to Return 
        ArrayList<HS900> lHS900s = new ArrayList<>();

        //Initialize Horel Device Instances
        HS900 phsShop_HS900 = new HS900();
        phsShop_HS900.Product_ID = "BR23991X8890";
        phsShop_HS900.Device_Name = "PHS Cutter";
        phsShop_HS900.Firmware_Version = 2;

        HS900 dmsShop_HS900 = new HS900();
        dmsShop_HS900.Product_ID = "NMX2545LBQ59";
        dmsShop_HS900.Device_Name = "DMS Cutter";
        dmsShop_HS900.Firmware_Version = 1;

        //Add Device to Returned List
        lHS900s.add(phsShop_HS900);
        lHS900s.add(dmsShop_HS900);

        //Function Returns List
        return lHS900s;

    }


}
