package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WestMinsterGym implements GymManager {

    private List<DefaultMember> memList = new ArrayList<DefaultMember>();

    public void testCase() {
        DefaultMember testDefault = new DefaultMember("0001", "Abdul", new Date("01", "08", "2020"), "779999945", "male");
        StudentMember testStudent = new StudentMember("0002", "Zahir", new Date("31", "07", "2020"), "779699945", "male", "St. Joseph's", "10");
        Over60 testOver60 = new Over60("0003", "Fathima", new Date("30", "07", "2020"), "779993945", "female", 67, "no");
        this.memList.add(testDefault);
        this.memList.add(testStudent);
        this.memList.add(testOver60);
    }

    @Override
    public void add(DefaultMember mem)
    {
        if (memList.size() < 100) {
            memList.add(mem);
        }else{
            System.out.println("Sorry No space in our WestMinster Gym. Join next month");
            }
        System.out.println(memList.size()+" Members are in this Branch");
        System.out.println(100-memList.size()+" free spaces are in this Branch");
    }


    @Override
    public void delete(String id)
    {
        boolean bool = false;
        for(DefaultMember mem : memList)
        {
            if(mem.getId().equals(id))
            {
                bool = true;
                memList.remove(mem);
                System.out.println(id);
                if(mem instanceof Over60)
                {
                    System.out.print("Over 60 Members");
                }else if(mem instanceof StudentMember){
                    System.out.print("Student Member");
                }else{
                    System.out.print("Default Member");
                }
                System.out.println(" was successfully removed from your WestMinster Gym");
                System.out.println(memList.size()+" Members are in this Branch");
                System.out.println(100-memList.size()+" free spaces are in this Branch");
                break;
            }
        }
        if(!bool)
        {
            System.out.println(id + "member was not found on your server. Sorry");
        }
    }

    @Override
    public void print(){
        for(DefaultMember mem: memList)
        {
            System.out.print("Membership Number is : " + mem.getId() +"");

            if(mem instanceof Over60)
            {
                System.out.print(" Over 60 Member");
            }else if(mem instanceof StudentMember){
                System.out.print(" Student Member");
            }else{
                System.out.print(" Default Member");
            }
            System.out.print(" : Member name : " + mem.getName() + "");
            System.out.println(" : Start membership Date : " + mem.getStartMembershipDate() + "");
        }
        if(memList.size() == 0)
        {
            System.out.println("No members entered yet!");
        }
    }

    @Override
    public void sorting() {
        DefaultMember[] array = memList.toArray(new DefaultMember[] {});
        Assist.bubble(array);
        memList = Arrays.asList(array);
    }

    @Override
    public List<DefaultMember> getMemList() {
        return this.memList;
    }

}
