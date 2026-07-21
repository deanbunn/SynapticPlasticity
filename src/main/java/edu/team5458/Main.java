package edu.team5458; //The Package the Classes in this File are Associated With

public class Main 
{
    public static void main(String[] args) 
    {
        
        //Submitted Argument Check
        if(args.length >= 2 && args[0].isEmpty() == false && args[1].isEmpty() == false)
        {
            //Load and Run FRC Team
            FRCTeam frcTeam = new FRCTeam(args[0],args[1]);
            
            // //Run Load Shop Function
            // frcTeam.ShowShop();

            //Run Display Team Function
            frcTeam.DisplayTeam();
            
        }
        

    }

}

