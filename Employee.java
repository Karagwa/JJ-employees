import java.util.*;
public class Employee {
    public int StaffNo;
    public String StaffName;
    public int StaffAge;

    Scanner keyboard=new Scanner(System.in);
    public void printStaffDetails(){
        System.out.println("StaffNo: "+StaffNo);
        System.out.println("StaffName: "+StaffName);
        System.out.println("StaffAge: "+StaffAge);

    }

    public void enterDetails(){
        System.out.println("Enter the employee number:");
        StaffNo=keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter the employee name:");
        StaffName= keyboard.nextLine();
        System.out.println("Enter the employee age:");
        StaffAge=keyboard.nextInt();
    }
}
