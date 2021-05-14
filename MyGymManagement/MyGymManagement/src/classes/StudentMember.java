package classes;

import classes.DefaultMember;

public class StudentMember extends DefaultMember
{
    private String schoolName;
    private String grade;

    public StudentMember(String id, String name,Date startMembershipDate,
                         String phoneNumber,String gender, String schoolName,
                         String grade)
    {
        super( id,name, startMembershipDate,phoneNumber,gender);
        this.schoolName = schoolName;
        this.grade = grade;
    }

//getters
    public String getSchoolName()
    {
        return schoolName;
    }
    public String getGrade()
    {
        return grade;
    }


//setters
    public void setSchoolName(String schoolName)
    {
        this.schoolName = schoolName;
    }
    public void setGrade(String grade)
    {
        this.grade = grade;
    }
}
