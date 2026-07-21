package edu.team5458;

public class FRCTeamStudent extends FRCTeamMember
{
    public YearInSchool Year_In_School;


    public FRCTeamStudent(String name,int years_in_first,TeamPrimaryGroup primary_group,YearInSchool year_in_school)
    {
        super(name,years_in_first,primary_group);
        this.Year_In_School = year_in_school;
    }

    public enum YearInSchool
    {
        middle_school,
        first_year,
        second_year,
        third_year,
        fourth_year
    }

    @Override
    public void CheerForTeam(String cheer)
    {
        System.out.println(cheer + " Go Burgandy!");
    }
}
