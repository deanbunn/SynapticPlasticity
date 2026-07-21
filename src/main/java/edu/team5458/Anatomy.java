/*
    Anatomy.java is reference file for learning Java code structure

    The Documentation Section (Optional)

    Example:
    Author: Dean Bunn
    Last Edited: 2026-07-21
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
    public double tuner_setting = 0.0;

    //#################################
    //Constructors
    //#################################
    public Anatomy()
    {

    }
  
    public Anatomy(String s_status,int s_count)
    {
        this.status = s_status;
        this.count = s_count;
    }

    //################################
    // Functions and Methods
    //###############################
    public void AddToCount(int n_value)
    {
        this.count += n_value;
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
