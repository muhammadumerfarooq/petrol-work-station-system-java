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
import java.util.Scanner;
public class SystemSoftwareAdmin {
private String Name;
private String password;
private Scanner sc;
public SystemSoftwareAdmin()
{
    sc = new Scanner (System.in);
 Name="John";
 
    System.out.println("System Software Admin is John");
    System.out.println("Enter Password ... Hint 12345 ");
    
 password=sc.nextLine().trim();
 if (password.equals("12345"))
 {
     System.out.println("Welcome !");
 }
}

public Recipt_Card CreateReciptCard(String n,String v,String vn,String vno,double amount,double petrol)
{
 Recipt_Card rc= new Recipt_Card(n,v,vn,vno);
 rc.createbillrecipt(amount,petrol);
 return rc;   
}
    
}
