package edu.team5458;

public class FRCTeamMentor extends FRCTeamMember 
{
    private boolean trainingCompleted;

    public FRCTeamMentor(String name,int yearsInFirst,TeamPrimaryGroup primaryGroup,Boolean traingCompleted)
    {
        super(name,yearsInFirst,primaryGroup);
        this.trainingCompleted = traingCompleted;
    }

    public boolean isTrainingCompleted()
    {
        return trainingCompleted;
    }

    public void setTrainingCompleted(boolean traingCompleted)
    {
        this.trainingCompleted = traingCompleted;
    }

    @Override
    public void cheerForTeam(String cheer)
    {
        System.out.println(cheer + " Mentors are awesome!");
    }

}
