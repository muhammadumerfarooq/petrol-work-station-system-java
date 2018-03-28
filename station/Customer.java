/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrolservice.station;
import java.util.Scanner;
        
//import java.util.ArrayList;

/**
 *
 * @author Umer
 */
public class Customer  {
   public Scanner sc;
    private String  Name;
    private String Vehicletype;
    private String VehicleName;
    private String Vehicleno;
    private Recipt_Card rc;
    public Customer()
    {
    rc= new Recipt_Card();
        sc=new Scanner(System.in);
        Name=  "";
        Vehicletype = "";
        VehicleName = "";
        Vehicleno = "";
    }
    public void addCustomer(String n,String v,String vn,String vno)
    {
        Name=(n);        
        Vehicletype=(v);
        VehicleName=(vn);
        Vehicleno=(vno);
    }
    public void leavevechicle()
    {
        System.out.println(" Customer has left Vehicle ");
    }
    public int Enquire(PetrolStation station)
    {
      return station.GiveConfirmation();
    
    }
    public void requestattendant(kiosk_attendant attend,int index,String mode)
    {
        attend.changePumpMode(index,mode);
    }
    public boolean fillpetrol(PetrolStation station, kiosk_attendant attend)
    {
        
     System.out.println(" Enter The Amount of Petrol You want to Fill ");
     double amount;
     amount=sc.nextDouble();
     if (station.gettotalpetrol()<amount)
     {
         System.out.println("We Don't Have Enough Petrol ");
     return false;
     }
     else
     {
      paybill(amount,attend,station);
      station.fill_petrol(amount);
      
         return true;
     }
     
    }
    public void paybill(double amount, kiosk_attendant attend,PetrolStation station)
    {
        double val=25;
        double money=0.0;
        System.out.println("Per Litre Petrol is 25 Dollars");
        System.out.println("Your Total Amount Is: "+(val*amount));
        System.out.println("Enter Amount");
        money=sc.nextDouble();
        if(money>(val*amount))
        {
            System.out.println(" Here is Your Change.."+(money-(val*amount)) +"Have a Nice Day ");
            station.fill_petrol(amount);
          
            rc=attend.createreciptbill(Name,Vehicletype,VehicleName,Vehicleno,amount,(money-(val*amount)));
            
        }
        else if (money==(val*amount))
        {
            System.out.println("Have a Nice Day");
            station.fill_petrol(amount);
            
            rc=attend.createreciptbill(Name,Vehicletype,VehicleName,Vehicleno,amount,(money));
            
        }
        else if (money<(val*amount))
        {
            System.out.println("Enter Amount is Less... Enter Again");
            money=sc.nextDouble();
         if(money>=(val*amount))
        {
            System.out.println(" Here is Your Change.."+(money-(val*amount)) +"Have a Nice Day ");
          station.fill_petrol(amount);
            
            rc=attend.createreciptbill(Name,Vehicletype,VehicleName,Vehicleno,amount,(money-(val*amount)));
            
        }
        }
    }
    public void displayrecipt()
    {
        System.out.println("-------------------------------------------------");
       rc.Display();
        
    }
    
}
