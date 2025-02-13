import java.util.Scanner;
public class TestBloodData
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);

  BloodData b1 = new BloodData();

  System.out.print("Enter Blood Type: ");
  String blood1 = in.nextLine();
  System.out.print("Enter Rh: ");
  String rh1 = in.nextLine();
  
  BloodData b2 = new BloodData(blood1, rh1);
  
  System.out.println("\n1 BloodData");
  b1.displayInfo();
  System.out.println("\n2 BloodData");
  b2.displayInfo();
 }
}