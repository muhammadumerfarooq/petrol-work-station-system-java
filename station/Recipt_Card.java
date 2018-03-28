/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrolservice.station;

import java.util.Scanner;
import java.util.*;
import java.text.*;

/**
 *
 * @author Umer
 */
public class Recipt_Card {
    //public Scanner sc;
    private String  CustomerName;
    private String CustomerVehicletype;
    private String CustomerVehicleName;
    private String CustomerVehicleno;
    private Date indate;
    private Date outdate;
    private Double Amountpaid;
    private Double petrolfilled;
    
    public Recipt_Card()
    {
        
    }
public Recipt_Card(String n,String v,String vn,String vno)       
{
    CustomerName=n;
    CustomerVehicletype=v;
    CustomerVehicleName=vn;
    CustomerVehicleno=vno;
}
    public void createbillrecipt(double d,double p)
    {
        Amountpaid=d;
        petrolfilled=p;
        
        Date dNow = new Date( );
        
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
 Calendar cal = Calendar.getInstance();
 cal.setTime(dNow);
 cal.add(Calendar.MINUTE, 10);
 
      System.out.println("Current Date: " + ft.format(dNow));
     Amountpaid = d;
     indate=dNow;
     outdate=cal.getTime();
             
             
             
    }
    public void Display()
    {
        System.out.println("Cusomter Name: "+CustomerName);
        System.out.println("Customer Vehicletype: "+CustomerVehicletype);
        System.out.println("Customer VehicleName: "+CustomerVehicleName);
        System.out.println("CustomerVehicleno: "+CustomerVehicleno);
        System.out.println("Customer IN Time: "+indate);
        System.out.println("Customer OUT Time: "+outdate);
        System.out.println("Customer Amount Paid: "+Amountpaid);
        System.out.println("Customer Petrol Filled: "+petrolfilled);
        
        
        
      
        
    }
}
