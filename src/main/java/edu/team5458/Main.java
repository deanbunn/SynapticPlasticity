/*
    The "main" Function of the Main File Runs when the App Starts
*/

package edu.team5458; //The Package this File is Associated with

import edu.wjusd.*; //Import Required Training Classes

public class Main 
{
    public static void main(String[] args) 
    {
        
        //Submitted Argument Check
        if(args.length >= 2 && args[0].isEmpty() == false && args[1].isEmpty() == false)
        {
            //Load and Run FRC Team
            FRCTeam frcTeam = new FRCTeam(args[0],args[1]);
            
            //Display the Team Name and Number
            frcTeam.DisplayTeamNameAndNumber();

            //Run Load Shop Function
            frcTeam.ShowShop();

            //Run Display Team Function
            frcTeam.DisplayTeam();
            
        }
        else if(args.length == 1 && args[0].isEmpty() == false)
        {
            //Switch Statement for Lesson to Run
            switch(args[0].toLowerCase())
            {
                case "lesson01":
                    Lesson01 lesson01 = new Lesson01();
                    lesson01.StartLesson();
                    break;
                case "lesson02":
                    Lesson02.StartLesson();
                    break;
                case "lesson03":
                    Lesson03.StartLesson();
                    break;
                case "lesson04":
                    Lesson04.StartLesson();
                    break;
                default:
                    System.out.println("Incorrect lesson number");
            }

        }//End of Submitted Argument Checks
        
    }

}

