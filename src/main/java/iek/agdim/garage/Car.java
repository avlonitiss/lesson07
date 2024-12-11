/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iek.agdim.garage;

/**
 *
 * @author User
 */
public class Car {
    private String maker;
    
    private String model;
    
    private int odometer;
    
    private String color;
    
    private String plates;
    
        private Driver odigos;

    /**
     * Get the value of odigos
     *
     * @return the value of odigos
     */
    public Driver getOdigos() {
        return odigos;
    }

    /**
     * Set the value of odigos
     *
     * @param odigos new value of odigos
     */
    public void setOdigos(Driver odigos) {
        this.odigos = odigos;
    }

    
    
    public Car(String maker, String model ){
        this.maker=maker;
        this.model=model;
        color="paintless";
        odometer=-1;
        plates="not registered";
        System.out.println("To aftokinito ftiaxtike");
    }

    public Car(String maker, String model, String color) {
        this.maker = maker;
        this.model = model;
        this.color = color;
        odometer=10;
        plates="not registered";
    }

    public Car(String maker, String model, int odometer, String color, String plates) {
        this.maker = maker;
        this.model = model;
        this.odometer = odometer;
        this.color = color;
        this.plates = plates;
    }
    
        public void printData(){
        System.out.println("Car Maker is: "+maker);
        System.out.println("Car Model is: "+model);
        System.out.println("Car Color is: "+color);
        System.out.println("Car odometer has : "+odometer);
        System.out.println("Car Plates are: "+plates);
    }
        public void moveCar(){
        odometer++;
    }
    /**
     * Get the value of plates
     *
     * @return the value of plates
     */
    public String getPlates() {
        return plates;
    }

    /**
     * Set the value of plates
     *
     * @param plates new value of plates
     */
    public void setPlates(String plates) {
        this.plates = plates;
    }


    /**
     * Get the value of color
     *
     * @return the value of color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set the value of color
     *
     * @param color new value of color
     */
    public void setColor(String color) {
        this.color = color;
    }


    /**
     * Get the value of odometer
     *
     * @return the value of odometer
     */
    public int getOdometer() {
        return odometer;
    }

    /**
     * Set the value of odometer
     *
     * @param odometer new value of odometer
     */
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }


    /**
     * Get the value of model
     *
     * @return the value of model
     */
    public String getModel() {
        return model;
    }

    /**
     * Set the value of model
     *
     * @param model new value of model
     */
    public void setModel(String model) {
        this.model = model;
    }

    
    
    public void setMaker(String maker){
        this.maker=maker;
    }
    
    public String getMaker(){
        return maker;
    }
    
}
