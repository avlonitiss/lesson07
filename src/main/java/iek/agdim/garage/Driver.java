/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iek.agdim.garage;

/**
 *
 * @author User
 */
public class Driver {
    
    private String name;
    
    private int birthYear;

    public Driver(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    
    
    public void printData(){
        System.out.println("Driver name is: "+name);
        System.out.println("Driver birth year is : "+birthYear);
    }

    /**
     * Get the value of birthYear
     *
     * @return the value of birthYear
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Set the value of birthYear
     *
     * @param birthYear new value of birthYear
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

}
