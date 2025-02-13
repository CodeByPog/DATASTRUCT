public class BloodData
{
 private String bloodtype;
 private String Rh;
 
 public BloodData()
 {
  this.bloodtype = "O";
  this.Rh = "+";
 }
 
 public BloodData(String bloodtype, String Rh)
 {
  this.bloodtype = bloodtype;
  this.Rh = Rh;
 }
 
 public String getBloodtype()
 {
  return bloodtype;
 }
 
 public void setBloodtype(String bloodtype)
 {
  this.bloodtype = bloodtype;
 }
 
 public String getRh()
 {
  return Rh;
 }
 
 public void setRh(String Rh)
 {
  this.Rh = Rh;
 }
 
 public void displayInfo()
 {
  System.out.println("BloodType: " + bloodtype.toUpperCase() + Rh);
 }
}