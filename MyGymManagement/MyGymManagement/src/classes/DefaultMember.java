package classes;

public class DefaultMember implements Comparable <DefaultMember>{
    private String id;
    private String name;
    private Date startMembershipDate;
    private String phoneNumber;
    private String gender;

    public DefaultMember(String id, String name,Date startMembershipDate,
                         String phoneNumber, String gender)
    {
        super();
        this.id = id;
        this.name = name;
        this.startMembershipDate = startMembershipDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

//getters

    public String getName()
    {
        return name;
    }
    public Date getStartMembershipDate()
    {
        return startMembershipDate;
    }
    public String getId()
    {
        return id;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getGender() {return gender;}


//setters

    public void setName(String name)
    {
        this.name = name;
    }
    public void setStartMembershipDate(Date startMembershipDate)
    {
        this.startMembershipDate = startMembershipDate;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public void setGender(String gender) {this.gender = gender;}


    @Override
    public int compareTo(DefaultMember r) {
        return this.name.compareTo(r.getName());
    }
}


