package classes;

import classes.DefaultMember;

public class Over60 extends DefaultMember
{
    private int memberAge;
    private String anyDisease;

    public Over60(String id, String name, Date startMembershipDate,String phoneNumber,
                  String gender, int memberAge, String anyDisease)
    {
        super(id,name, startMembershipDate, phoneNumber,gender);
        setMemberAge(memberAge);
        this.anyDisease = anyDisease;
    }

    public int getMemberAge()
    {
        return memberAge;
    }

    public void setMemberAge(int memberAge)
    {
        if (memberAge >= 60) {
            this.memberAge = memberAge;
        } else {
            throw new IllegalArgumentException("You must enter Over 60 ages only");
        };

    }

    public String getAnyDisease(String anyDisease) {return anyDisease;}
    public void setAnyDisease(String anyDisease) { this.anyDisease = anyDisease;}
}
