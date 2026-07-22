package edu.team5458;

public class FRCTeamStudent extends FRCTeamMember
{

    public YearInSchool yearInSchool;

    public FRCTeamStudent(String name,int yearsInFirst,TeamPrimaryGroup primaryGroup,YearInSchool yearInSchool)
    {
        super(name,yearsInFirst,primaryGroup);
        this.yearInSchool = yearInSchool;
    }

    public enum YearInSchool
    {
        middle_school,
        first_year,
        second_year,
        third_year,
        fourth_year
    }

    public YearInSchool getYearInSchool()
    {
        return yearInSchool;
    }

    public void setYearInSchool(YearInSchool yearInSchool)
    {
        this.yearInSchool = yearInSchool;
    }

    @Override
    public void cheerForTeam(String cheer)
    {
        System.out.println(cheer + " Go Burgandy!");
    }
}
