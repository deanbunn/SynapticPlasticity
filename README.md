## Synaptic Plasticity

A Java training repository for FRC Team 5458 (Digital Minds) developers, covering the fundamentals of object-oriented programming.

### File Overview:

- `src/main/java/edu/team5458/Main.java` — Entry point of the application.
- `src/main/java/edu/team5458/Anatomy.java` — Reference file for learning Java code structure.
- `src/main/java/edu/team5458/FRCTeam.java` — Class for constructing and displaying team components.
- `src/main/java/edu/team5458/FRCTeamMember.java` — Abstract parent class for team students and mentors.
- `src/main/java/edu/team5458/FRCTeamMentor.java` — Child class for team mentors.
- `src/main/java/edu/team5458/FRCTeamStudent.java` — Child class for students.
- `src/main/java/com/giroux/energy/GE500.java` — Custom class for import example.
- `src/main/java/com/horel/solutions/HS900.java` — Custom class for import and class access examples.
- `src/main/java/com/horel/solutions/HS1200.java` — Custom class with builder example.
- `src/main/java/edu/wjusd/Lesson*.java` — Java basics lesson class files

### Common Java Naming Scheme:

| Element | Convention | Example |
|:--------|:-----------|:--------|
| Package | lowercase  | com.horel.solutions |
| Class   | PascalCase | FRCTeamStudent |
| Interface | PascalCase | Runnable |
| Enum     | PascalCase | YearInSchool |
| Enum constant | UPPER_SNAKE_CASE | FIRST_YEAR |
| Instance Property | camelCase | deviceName |
| Local variable | camelCase | currentSpeed |
| Object instance | camelCase | driveSubsystem | 
| Method | camelCase | calculateSpeed() |
| Constant (static final) | UPPER_SNAKE_CASE | MAX_SPEED |


### Naming Example: 

The classes (`XboxController`,`DriveSubsystem`) are in **PascalCase**, while the object instances (`driverController`,`driveSubsystem`) are in **camelCase**.

```java
private final XboxController driverController = new XboxController(0);
private final DriveSubsystem driveSubsystem = new DriveSubsystem();
private final CommandXboxController operatorController = new CommandXboxController(1);
```

### Resource Links:

- [W3 Schools: Java Tutorial](https://www.w3schools.com/java/)
- [W3 Schools: Java OOP](https://www.w3schools.com/java/java_oop.asp)
- [Geeks for Geeks: Java OOP(Object Oriented Programming) Concepts](https://www.geeksforgeeks.org/java/object-oriented-programming-oops-concept-in-java/)
- [Oracle: Object-Oriented Programming Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [freeCodeCamp: OOP Meaning – What is Object-Oriented Programming?](https://www.freecodecamp.org/news/what-is-object-oriented-programming/)
- [WPILib: What is WPILib?](https://docs.wpilib.org/en/stable/docs/software/what-is-wpilib.html)
- [WPILib: Creating a Robot Program](https://docs.wpilib.org/en/stable/docs/software/vscode-overview/creating-robot-program.html)
- [WPILib: What Is “Command-Based” Programming?](https://docs.wpilib.org/en/stable/docs/software/commandbased/what-is-command-based.html)
- [WPILib: Organizing Command-Based Robot Projects](https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html)
- [Team 5458 Git Usage](https://github.com/FRCTeam5458DigitalMinds/Team5458GitUsage)


### Anatomy of Java Code Structure:

```java
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

    //#####################################
    // Main Method (for Main.java files)
    //####################################
    // public static void main(String[] args)
    // {
    //   //Start the application
    // }
    
}

//###########################################
// Additional Non-Public Classes (Optional)
//###########################################
class HelpingHands
{
    //Auxiliary Codes Go Here
}


```