import java.util.Scanner;

public class Fulltime extends Employee{
    public double monthlyBasicSalary;
    public double taxDeduction;

    public double netPay;

    public void getNetPay(){
        System.out.println("Enter the monthly salary of the fulltime employee:");
        Scanner keyboard= new Scanner (System.in);
        monthlyBasicSalary= keyboard.nextDouble();
        System.out.println("Enter the tax of the fulltime employee:");
        taxDeduction= keyboard.nextDouble();
        netPay=monthlyBasicSalary-taxDeduction;
        keyboard.close();

    }
    public void printStaffDetails(){
        System.out.println("StaffNo: "+StaffNo);
        System.out.println("StaffName: "+StaffName);
        System.out.println("StaffAge: "+StaffAge);
        System.out.println("StaffSalary: "+netPay);
    }

    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Welcome to J and J enterprises.");
        System.out.println("Enter the number of fulltime employees: ");
        int numberOfEmployees=keyboard.nextInt();
        Fulltime [] employee= new Fulltime[numberOfEmployees];
       
        for (int i=0; i<employee.length; i++){
            employee[i] =new Fulltime();
            employee[i].enterDetails();
            employee[i].getNetPay();

        }

        for(Fulltime f: employee){
            f.printStaffDetails();
        }
        keyboard.close();
        
    }
}
