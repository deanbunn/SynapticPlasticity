package edu.team5458;

//Importing Required Packages
import java.util.ArrayList;
import com.giroux.energy.GE500; //Importing Only the One Required Class
import com.horel.solutions.*; //Importing All Classes in Package

public class FRCTeam 
{

    //Properties for Class
    public int Team_Number = 0;
    public String Team_Name = "";

    public FRCTeam()
    {
        
    }

    public void DisplayTeamNameAndNumber()
    {
        //Print Out Team Name and Number
        System.out.println("\nTeam Name: " + Team_Name);
        System.out.println("Team Number: " + Team_Number + "\n");

    }

    public void LoadShop()
    {
        
        //Print Out All the HS900 Device Names
        for(HS900 hs900 : LoadHS900s())
        {

            System.out.println("HS900: " + hs900.Device_Name);
        }
        
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
