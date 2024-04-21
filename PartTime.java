import java.util.*;
public class PartTime extends Employee{
    public int numberOfHours;
    public final int rate=2500;
    public double totalPay;

    public double tax=0.3*totalPay;

    public int year;


    Scanner keyboard=new Scanner(System.in);
    //String[] month30 ={"April","June","September","November"};
    //String [] month31={"January", "March","May","July","August","September","October","December"};
    //String[] monthFeb={"February"};
    ArrayList<String> month30=new ArrayList<>(Arrays.asList("April","June","September","November"));
    ArrayList<String> month31=new ArrayList<>(Arrays.asList("March","May","July","August","September","October","December"));
    public void calculateTotalPay() {
        Scanner keyboard= new Scanner(System.in);
        String month= keyboard.nextLine();
        year=keyboard.nextInt();
        if (month30.contains(month)) {
            totalPay = 2500 * numberOfHours * 30;
        }
        else if(month31.contains(month)){
            totalPay=2500*numberOfHours*31;
        }
        else{
            if (year%4==0&&year%100==0&&year%400==0){
                totalPay=2500*numberOfHours*29;
        }
            else{
                totalPay=2500*numberOfHours*28;
            }
        }
    }

    public void printStaffDetails(){
        System.out.println("StaffNo: "+StaffNo);
        System.out.println("StaffName: "+StaffName);
        System.out.println("StaffAge: "+StaffAge);
        System.out.println("StaffSalary: "+totalPay);
    }



}
