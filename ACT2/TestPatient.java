import java.util.Scanner;
public class TestPatient
{
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  
  Patient p1 = new Patient();
  
  System.out.print("\nPatient 2 \nEnter BloodType: ");
  String blood2 = in.nextLine();
  System.out.print("Enter Rh: ");
  String rh2 = in.nextLine();
  System.out.print("Enter ID: ");
  int id2 = in.nextInt();
  System.out.print("Enter AGE: ");
  int age2 = in.nextInt();
  
  Patient p2 = new Patient(blood2, rh2, id2, age2);
  
  in.nextLine();
  
  System.out.print("\nPatient 3 \nEnter ID: ");
  int id3 = in.nextInt();
  System.out.print("Enter AGE: ");
  int age3 = in.nextInt();
  
  Patient p3 = new Patient("O", "+", id3, age3);
  
  System.out.println("Info of Patient 1");
  p1.info();
  System.out.println("Info of Patient 2");
  p2.info();
  System.out.println("Info of Patient 3");
  p3.info();
 }
}