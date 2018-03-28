/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrolservice.station;

/**
 *
 * @author Umer
 */
public class kiosk_attendant {

    PetrolStation station;
    private String Name;
    private int ID;
    private double salary;
    private String Designation;
   // private totalLitreofPetrol;
    SystemSoftwareAdmin admin;
    public kiosk_attendant()
    {
        station = new PetrolStation();
        admin = new SystemSoftwareAdmin();
        Name="";
        ID=0;
        salary=0.0;
        Designation="";
       
    }
   
    public Recipt_Card createreciptbill(String n,String v,String Vn,String Vno,double amount,double petrol)
    {
     return   admin.CreateReciptCard(n,v,Vn,Vno,amount,petrol);
    }
      
    public void setpertolstation(PetrolStation stat)
    {
        station=stat;
    }
    public void ManageInventory()
    {
        
    }
    public void changePumpMode(int i,String mode)
    {
        station.changemode(i,mode);
    }
}
