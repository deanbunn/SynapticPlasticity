package edu.team5458;

public class FRCTeamMentor extends FRCTeamMember 
{
    public boolean Training_Completed;

    public FRCTeamMentor(String name,int years_in_first,TeamPrimaryGroup primary_group,Boolean traing_completed)
    {
        super(name,years_in_first,primary_group);
        this.Training_Completed = traing_completed;
    }

    @Override
    public void CheerForTeam(String cheer)
    {
        System.out.println(cheer + " Mentors are awesome!");
    }

}
