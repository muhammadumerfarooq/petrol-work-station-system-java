/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrolservice.station;

import java.util.ArrayList;

/**
 *
 * @author Umer
 */
public class PetrolStation {
   // kiosk_attendant attendant;
    private String  name;
    private String address;
    private ArrayList<String> stationmode;
    private ArrayList<Integer>PetrolPumpNo;
    private double TotalPetrol;
       
 public PetrolStation()
    {
       // attendant=new kiosk_attendant();
        name="ShellHelix Petrol Pump";
        address="NewYork Street 91 est America";
        stationmode=new ArrayList<String>();
        PetrolPumpNo = new ArrayList<Integer>();
        for (int i=1;i<=10;i++)
        {   
            stationmode.add("standby");
            PetrolPumpNo.add(i);
        }
        TotalPetrol=10000.0;   // litres of petrol every time when customer ask for request petrol then it will subtract from it
        
    }
 public double gettotalpetrol()
 {
     return TotalPetrol;
 }
 public void setTotalPetrol(double petrol)
 {
     TotalPetrol=TotalPetrol-petrol;
 }
 public String getpump()
 {
     return stationmode.get(0);
 }
 public int GiveConfirmation()//String name,String vehicle,String VehicleType,String Vehicleno)
 {
  for (int i=0;i<10;i++){  
      String val=stationmode.get(i);
      if (val.equals("standby"))
  System.out.println(" Petrol Pump No: "+(i+1));
  System.out.println("Pertol Pump is in StandBy Mode");
  return i;
  
  
  }
return 0;
 }
 
 public void changemode(int index,String mode)
{
    String s=  stationmode.get(index);
    stationmode.remove(index);
    s=mode;
    stationmode.add(index, s);
    if (mode=="ready")
    System.out.println(" Attendant has set the State Of Petrol Pump To Ready ");
    else
    System.out.println(" Attendant has set the State Of Petrol Pump To Standby12345 ");
    
}
public boolean fill_petrol(double amount)
{
    TotalPetrol = TotalPetrol-amount;
    return true;
}
}

