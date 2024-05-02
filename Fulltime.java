import java.util.Scanner;

/**
 * Represents a full-time employee.
 */
public class Fulltime extends Employee {
    private double monthlyBasicSalary;
    private double taxDeduction;
    private double netPay;

    /**
     * Constructs a Fulltime object and prompts the user to enter the monthly salary and tax deduction.
     */
    public Fulltime() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the monthly salary of the fulltime employee:");
        monthlyBasicSalary = keyboard.nextDouble();
        System.out.println("Enter the tax of the fulltime employee:");
        taxDeduction = keyboard.nextDouble();
        netPay = monthlyBasicSalary - taxDeduction;
        
    }

    /**
     * Prints the details of the full-time employee, including staff number, name, age, and net pay.
     */
    public void printStaffDetails() {
        System.out.println("StaffNo: " + StaffNo);
        System.out.println("StaffName: " + StaffName);
        System.out.println("StaffAge: " + StaffAge);
        System.out.println("StaffSalary: " + netPay);
    }

    /**
     * The entry point of the program. Prompts the user to enter the number of full-time employees,
     * creates an array of Fulltime objects, and prints the details of each employee.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to J and J enterprises.");
        System.out.println("Enter the number of fulltime employees: ");
        int numberOfEmployees = keyboard.nextInt();
        Fulltime[] employees = new Fulltime[numberOfEmployees];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Fulltime();
        }

        for (Fulltime fulltimeEmployee : employees) {
            fulltimeEmployee.printStaffDetails();
        }
        keyboard.close();
    }
}
