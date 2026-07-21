package edu.team5458; //The Package the Classes in this File are Associated With

public class Main 
{
    public static void main(String[] args) 
    {
        
        //Submitted Argument Check
        if(args.length >= 2 && args[0].isEmpty() == false && args[1].isEmpty() == false)
        {

            //Load and Run FRC Team
            FRCTeam frcTeam = new FRCTeam();
            
            //Set Team Name and Number
            frcTeam.Team_Name = args[0];
            frcTeam.Team_Number = Integer.parseInt(args[1]);

            //Display Team Name and Number
            frcTeam.DisplayTeamNameAndNumber();

            //Run Load Shop Function
            frcTeam.LoadShop();

        }
        

    }

}

