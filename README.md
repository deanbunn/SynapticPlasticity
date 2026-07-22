## Synaptic Plasticity

A training repository showcasing object-oriented programming concepts, practices, and features in Java. 


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


#### Naming Example: 

```java
private final XboxController driverController = new XboxController(0);
private final DriveSubsystem driveSubsystem = new DriveSubsystem();
private final CommandXboxController operatorController = new CommandXboxController(1);
```
The classes (`XboxController`,`DriveSubsystem`) are in **PascalCase**, while the object instances (`driverController`,`driveSubsystem`) are in **camelCase**.


### Resources:

- [W3 Schools: Java OOP](https://www.w3schools.com/java/java_oop.asp)
- [Geeks for Geeks: Java OOP(Object Oriented Programming) Concepts](https://www.geeksforgeeks.org/java/object-oriented-programming-oops-concept-in-java/)
- [Oracle: Object-Oriented Programming Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [freeCodeCamp: OOP Meaning – What is Object-Oriented Programming?](https://www.freecodecamp.org/news/what-is-object-oriented-programming/)
