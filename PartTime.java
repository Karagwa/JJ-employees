import java.util.*;
public class PartTime extends Employee{
    public int numberOfHours;
    public final int rate=2500;
    public double totalPay;
    public double tax=0.3*totalPay;
    public double netPay=totalPay-tax;
    public int year;
    public String month;

    public void enterDetails(){

        System.out.println("Enter the employee number:");
        StaffNo=keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter the employee name:");
        StaffName= keyboard.nextLine();
        System.out.println("Enter the employee age:");
        StaffAge=keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter the year of employment:");
        year=keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter the month of employment:");
        month= keyboard.nextLine();
        System.out.println("Enter the number of hours worked:");
        numberOfHours=keyboard.nextInt();
        keyboard.nextLine();
        
    }


    
ArrayList<String> month30 = new ArrayList<>(Arrays.asList("april","june","september","november"));
ArrayList<String> month31 = new ArrayList<>(Arrays.asList("january","march","may","july","august","october","december"));

public void calculateTotalPay() {
    int daysInMonth = 0;
    if (month30.contains(month.toLowerCase())) {
        daysInMonth = 30;
    } else if (month31.contains(month.toLowerCase())) {
        daysInMonth = 31;
    } else if (month.equalsIgnoreCase("february")) {
        daysInMonth = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
    }
    for(int i = 0; i < daysInMonth; i++){
        System.out.println("Day "+(i+1)+": ");
        System.out.println("Enter the number of hours worked: ");
        numberOfHours += keyboard.nextInt();
    }
    totalPay = rate * numberOfHours * daysInMonth;
    tax = 0.3 * totalPay;
    netPay = totalPay - tax;
}

public void printStaffDetails(){
        System.out.println("StaffNo: "+StaffNo);
        System.out.println("StaffName: "+StaffName);
        System.out.println("StaffAge: "+StaffAge);
        System.out.println("StaffSalary: "+netPay);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the salary estimator: part time employees edition!");
        System.out.println("Enter the number of part time employees");
        Scanner keyboard= new Scanner (System.in);
        int numberOfPartTimeEmployees=keyboard.nextInt();
        keyboard.nextLine();
        PartTime [] employee=new PartTime[numberOfPartTimeEmployees];
        for(int i=0; i<employee.length;i++){
            employee[i]=new PartTime();
            employee[i].enterDetails();
            employee[i].calculateTotalPay();
        }

        for(PartTime person: employee){
            person.printStaffDetails();
        }
    
        keyboard.close(); 
    }


    
}
