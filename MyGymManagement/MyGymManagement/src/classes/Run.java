package classes;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

public class Run extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        WestMinsterGym westMinsterGym = new WestMinsterGym();
        System.out.println("Welcome to Westminster Gym");
        System.out.println("**************************");
        westMinsterGym.testCase();
        while(true){
            Scanner iAmRinoza = new Scanner(System.in);
            System.out.println("\n****    Action Menu   ****");
            System.out.println("  Keys  : Actions");
            System.out.println("(add)   : Add a member");
            System.out.println("(delete): Delete a member");
            System.out.println("(print) : Print current members");
            System.out.println("(sort)  : Sort your members by their names");
            System.out.println("(table) : View current members\n");
            System.out.println("Choose your action : ");
            String action = iAmRinoza.nextLine();
            if (action.equals("add")) {
                System.out.println("Membership ID : ");
                String id = iAmRinoza.nextLine();
                System.out.println("Member Name   : ");
                String name = iAmRinoza.nextLine();
                System.out.print("Started day   : ");
                String day = iAmRinoza.nextLine();
                System.out.print("Started month : ");
                String month = iAmRinoza.nextLine();
                System.out.print("Started year  : ");
                String year = iAmRinoza.nextLine();
                Date startMembershipDate = new Date(day, month, year);
                System.out.println("Phone Number  : ");
                String phoneNumber = iAmRinoza.nextLine();
                System.out.println("Gender (male/female)  : ");
                String gender = iAmRinoza.nextLine();
                while (true) {
                    Scanner takeSpecial = new Scanner(System.in);
                    System.out.println("Types : (default) : (student) : (adult)");
                    System.out.print("Type : ");
                    String type = takeSpecial.nextLine();
                    if (type.equals("default")) {
                        DefaultMember newMember = new DefaultMember(id, name, startMembershipDate, phoneNumber, gender);
                        westMinsterGym.add(newMember);
                        break;
                    }
                    if (type.equals("student")) {
                        System.out.print("Student School Name  : ");
                        String schoolName = takeSpecial.nextLine();
                        System.out.print("Student Grade        : ");
                        String grade = takeSpecial.nextLine();
                        StudentMember newMember = new StudentMember(id, name, startMembershipDate, phoneNumber, gender, schoolName, grade);
                        westMinsterGym.add(newMember);
                        break;
                    }
                    if (type.equals("adult")) {
                        System.out.print("Disease(yes/no) : ");
                        String anyDisease = iAmRinoza.nextLine();
                        System.out.print("Age             : ");
                        int memberAge = takeSpecial.nextInt();
                        Over60 newMember = new Over60(id, name, startMembershipDate, phoneNumber, gender, memberAge, anyDisease);
                        westMinsterGym.add(newMember);
                        break;
                    }
                    System.out.println("Please enter a valid type.");
                }
            } else if (action.equals("delete")) {
                Scanner takeSpecial = new Scanner(System.in);
                System.out.print("Input the membership number to delete : ");
                String id = takeSpecial.nextLine();
                westMinsterGym.delete(id);
            } else if (action.equals("print")) {
                westMinsterGym.print();
            } else if (action.equals("sort")) {
                westMinsterGym.sorting();
            } else if (action.equals("table")) {
                break;
            }
        }
        Assist.tableView(primaryStage,westMinsterGym.getMemList());
    }
}


