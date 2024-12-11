/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package iek.agdim.garage;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Garage {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        Car car1 = new Car("Ferrari","F40");
        
       
        car1.printData();
        
        Car car2 = new Car("Opel","Corsa","Yellow");
        car2.printData();
        
        if(car2.getOdometer()>2){
            System.out.println("Car has been moved");
        }
        String myModel;
        String myMaker;
        Car[] garage = new Car[5];
        for(int i =0;i<5;i++){
            
            System.out.println("Give Car Maker for car "+ i);
            myMaker=sc.nextLine();
             System.out.println("Give Car Model for car "+ i);
            myModel=sc.nextLine();
            garage[i]=new Car(myMaker,myModel);
        }
        
        
        Driver dr1 = new Driver("John",1999);
        
        car1.setOdigos(dr1);
        if(2024-car1.getOdigos().getBirthYear()<30){
            System.out.println("Driver is young");
        }
    }
    
}
