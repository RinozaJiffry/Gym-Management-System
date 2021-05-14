package classes;

import classes.DefaultMember;

import java.util.List;

public abstract interface GymManager
{
   public void add(DefaultMember mem);
   public void delete(String id);
   public void print();
   public void sorting();
   public List<DefaultMember> getMemList();
}
