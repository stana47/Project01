package Project00;

public class StarbucksTeam  extends Team {


    public StarbucksTeam(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new Alramyan("Alramyan"));
        members.add(new KirkpatrickMember("Riley Kirkpatrick"));
    }
}
