public class Patient
{
 private int id = 0;
 private int age = 0;
 private BloodData bloodData;
 
 public Patient()
 {
  this.id = 0;
  this.age = 0;
  this.bloodData = new BloodData();
 }
 public Patient(String bloodtype, String Rh, int id, int age)
 {
  this.bloodData = new BloodData(bloodtype, Rh);
  this.id = id;
  this.age = age;
 }
 
 public BloodData getBloodData()
 {
  return bloodData;
 }
 
 public void setBloodData(BloodData bloodData)
 {
  this.bloodData = bloodData;
 }
 
 public int getId()
 {
  return id;
 }
 
 public void setId(int id)
 {
  this.id = id;
 }
 
 public int getAge()
 {
  return age;
 }
 
 public void setAge(int age)
 {
  this.age = age;
 }
 
 public void info()
 {
  System.out.println("ID: " + id);
  System.out.println("Age: " + age);
  bloodData.displayInfo();
 }
}