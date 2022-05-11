import java.io.Console;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import models.Accountant;
import models.Admin;
import models.CleaningStaff;
import models.WatchMan;

public class main {
    
    public static void main(String[] args) {
        ArrayList<Accountant> accountants = new ArrayList<Accountant>();
        ArrayList<Admin> admins = new ArrayList<Admin>();
        ArrayList<CleaningStaff> cleaningStaffs = new ArrayList<CleaningStaff>();
        ArrayList<WatchMan> watchMans = new ArrayList<WatchMan>();
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("Wellcome!");
            System.out.println("***************************");
            System.out.println("1. Add Register");
            System.out.println("2. show Register");            
            System.out.println("3. Exit");

            System.out.println("enter a Option: ");
             option = input.nextInt();

            switch(option){
                case 1 :
                    System.out.println("What type registration? \n");
                    System.out.println("1. Accountant");
                    System.out.println("2. Admin");
                    System.out.println("3. CleaningStaff");
                    System.out.println("4. WatchMan");
                    int option2 = input.nextInt();
                    switch(option2){
                        case 1 :
                        accountants.add( createAcountant(input));
                        break;
                        case 2 :
                       admins.add( createAdmin(input));
                        break;
                        case 3 :
                         cleaningStaffs.add( createCleaningStaff(input));
                        break;
                        case 4 :
                        watchMans.add( createWatchMan(input));
                    }                   

                case 2 :
                    System.out.println("what type registers ? ");
                    System.out.println("1. Accountant");
                    System.out.println("2. Admin");
                    System.out.println("3. CleaningStaff");
                    System.out.println("4. WatchMan");

                    int option3 = input.nextInt();
                    switch(option3){
                        case 1 :
                        showAccountant(accountants);
                        break;
                        case 2 :
                        showAdmin(admins);
                        break;
                        case 3 :
                        showCleaningStaff(cleaningStaffs);
                        break;
                        case 4 :
                        showWatchMan(watchMans);
                        break;
                    }
                  
                    break;

               
                

                case 5 : System.exit(0);

                default :
                    System.exit(0);
                    break;
            }
        } while (option !=3 );
    }

   private static WatchMan createWatchMan(Scanner input) {
      
    System.out.println("Enter name: ");
    String name = input.nextLine();
    System.out.println("Enter indetification: ");
    String indetification = input.nextLine();
    System.out.println("Enter age: ");
    int age = input.nextInt();
    System.out.println("Enter Weapon: ");
    String weapon = input.nextLine();
    System.out.println("Enter day off: ");
    String dayOff = input.nextLine();
    return new WatchMan(name, indetification, age, weapon, Date.valueOf(dayOff));
    }

 private static void showCleaningStaff(ArrayList<CleaningStaff> cleaningStaffs) {
      cleaningStaffs.stream().forEach(action -> System.out.println(action));
    }

    private static void showWatchMan(ArrayList<WatchMan> watchMans) {
        watchMans.stream().forEach(watchMan -> System.out.println(watchMan));
    }

    private static void showAdmin(ArrayList<Admin> admins) {
        admins.stream().forEach(admin -> System.out.println(admin));
    }

    private static void showAccountant(ArrayList<Accountant> accountants) {
        accountants.stream().forEach(accountant -> System.out.println(accountant));
    }
    

    private static CleaningStaff createCleaningStaff(Scanner input) {
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter indetification: ");
        String indetification = input.nextLine();
        System.out.println("Enter age: ");
        int age = input.nextInt();
        System.out.println("Enter day off: ");
        String dayOff = input.nextLine();
        return new CleaningStaff(name, indetification, age, dayOff);
    }

    private static Admin createAdmin( Scanner input) {
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter indetification: ");
        String indetification = input.nextLine();
        System.out.println("Enter age: ");
        int age = input.nextInt();
        System.out.println("Enter a Leader: ");
        String leader = input.nextLine();
        System.out.println("Enter parking: ");
        String parking = input.nextLine();
    

        return new Admin(name, indetification, age, leader, parking);


        
    }

    private static Accountant createAcountant(  Scanner input) {
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter indetification: ");
        String indetification = input.nextLine();
        System.out.println("Enter age: ");
        int age = input.nextInt();
        System.out.println("Enter leader: ");
        String leader = input.nextLine();
        System.out.println("Enter parking: ");
        String parking = input.nextLine();
        return new Accountant(name, indetification, age, leader, parking);
    }
}
