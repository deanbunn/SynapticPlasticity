/*
    Documentation Section (Optional)

    Anatomy.java is reference file for learning Java code structure

    Example:
    Author: Dean Bunn
    Last Edited: 2026-07-22
*/

//#########################################
// Package Statement (Optional)
// A Java class can only belong to one package.
//#########################################
package edu.team5458; 

//##############################
// Import Statements (Optional)
//##############################
import java.util.ArrayList;
import java.math.*; //Using Asteric to pull all classes in namespace

//##################################
// Main Class Definition (Required)
//##################################
public class Anatomy 
{
    //#######################################
    // Instance and Class Variables Defined
    //#######################################
    public String status = "";
    public int count = 0;
    public double tunerSetting = 0.0;

    //#################################
    //Constructors (with Overloading)
    //#################################
    public Anatomy()
    {

    }
  
    public Anatomy(String status,int count)
    {
        this.status = status;
        this.count = count;
    }

    public Anatomy(String status, int count, double tunerSetting)
    {
        this.status = status;
        this.count = count;
        this.tunerSetting = tunerSetting;
    }

    //################################
    // Functions and Methods
    //###############################
    public void addToCount(int nValue)
    {
        this.count += nValue;
    }

    //##############################
    // Main Method
    //############################## 
    // public static void main(String[] args)
    // {
    //     //Commented Out for Now
    // }
    
}

//###########################################
// Additional Non-Public Classes (Optional)
//###########################################
class HelpingHands
{
    //Auxiliary Codes Go Here
}
