package edu.team5458;

public abstract class FRCTeamMember 
{
    private String name = "";
    private TeamPrimaryGroup primaryGroup;
    private int yearsInFirst = 0;

    public FRCTeamMember(String name,int yearsInFirst,TeamPrimaryGroup primaryGroup)
    {
        this.name = name;
        this.yearsInFirst = yearsInFirst;
        this.primaryGroup = primaryGroup;
    }

    public enum TeamPrimaryGroup
    {
        business,
        mechanical,
        programming
    }

    //Common Methods
    public void cheerForTeam(String cheer)
    {
        System.out.println(cheer);
    }

    //Getters
    public String getName()
    {
        return name;
    }

    public TeamPrimaryGroup getPrimaryGroup()
    {
        return primaryGroup;
    }
    
    public int getYearsInFIRST()
    {
        return yearsInFirst;
    }

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrimaryGroup(TeamPrimaryGroup primaryGroup)
    {
        this.primaryGroup = primaryGroup;
    }

    public void setYearsInFIRST(int yearsInFirst)
    {
        this.yearsInFirst = yearsInFirst;
    }

}
