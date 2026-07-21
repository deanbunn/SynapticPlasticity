package edu.team5458;

public abstract class FRCTeamMember 
{
    private String Name = "";
    private TeamPrimaryGroup Primary_Group;
    private int Years_in_FIRST = 0;

    public FRCTeamMember(String name,int years_in_first,TeamPrimaryGroup primary_group)
    {
        this.Name = name;
        this.Years_in_FIRST = years_in_first;
        this.Primary_Group = primary_group;
    }

    public enum TeamPrimaryGroup
    {
        business,
        mechanical,
        programming
    }

    //Common Methods
    public void CheerForTeam(String cheer)
    {
        System.out.println(cheer);
    }

    //Getters
    public String getName()
    {
        return Name;
    }

    public TeamPrimaryGroup getPrimaryGroup()
    {
        return Primary_Group;
    }
    
    public int getYearsInFIRST()
    {
        return Years_in_FIRST;
    }

    //Setters
    public void setName(String name)
    {
        this.Name = name;
    }

    public void setPrimaryGroup(TeamPrimaryGroup primary_group)
    {
        this.Primary_Group = primary_group;
    }

    public void setYearsInFIRST(int years_in_first)
    {
        this.Years_in_FIRST = years_in_first;
    }

}
