/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrolservice.station;
import java.util.Scanner;
/**
 *
 * @author Umer
 */
public class PetrolServiceStation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PetrolStation station =new PetrolStation();
      kiosk_attendant attendant =new kiosk_attendant();
      attendant.setpertolstation(station);
      
        Scanner sc = new Scanner (System.in);
        System.out.println("-----------------------------------------");
        System.out.println("Welcome To ShellHelix Petrol Station");
          Customer  c = null;
        while(true)
                {
      System.out.println("Press 1 to Create New Cusotmer");
      System.out.println("Press 2 to Fill Petrol");
      System.out.println("Press 3 to Quit");
      
      int choice;
      choice=sc.nextInt();
      if (choice==1)
      {
     c   = new  Customer();
      }
      else if (choice==2)              
      {
      
      int val = c.Enquire(station);
      if (val!=0){
          c.requestattendant(attendant, val,"ready");
      c.fillpetrol(station, attendant);
      System.out.println(station.getpump());
   
      c.requestattendant(attendant,val,"Standby");
      
      System.out.println(station.getpump());
       
      }
      }
      else if (choice==3)
          break;
      
       }
        
    }
    
}
