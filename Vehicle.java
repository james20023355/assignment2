package vehiclestarter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20023355
 */
public class Vehicle {
    private String manufacturer;
    private String model;
    private int makeYear;
    private int registrationNumber;
    private int odoKM = 0;
    private int tankCapacity;
    
    private FuelPurchase fuelPurchase;
    
    public Vehicle(String manufacturer, String model, int makeYear){ // Constructor
        this.manufacturer = manufacturer;
        this.model = model;
        this.makeYear = makeYear;
        fuelPurchase = new FuelPurchase();
    }
    
    
    // Getter and Setter Methods
    public String getManu(){
        return manufacturer;
    }
    
    public void setManu(String newManu){
        this.manufacturer = newManu;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setModel(String newModel){
        this.model = newModel;
    }
    
    public int getMake(){
        return makeYear;
    }
    
    public void setMake(int newMake){
        this.makeYear = newMake;
    }
    
    public int getRNo(){
        return registrationNumber;
    }
    
    public void setRNo(int newRNo){
        this.registrationNumber = newRNo;
    }
    
    public int getTankCap(){
        return tankCapacity;
    }
    
    public void setTankCap(int newTankCap){
        this.tankCapacity = newTankCap;
    }
    
    // end of getter and setter methods
    
    public void printDetails(){
        System.out.println("Vehicle: " + makeYear + " " + manufacturer + " " + model + " Travelled: " + odoKM + "km");
    }
    // Prints details
   
   // adds distance travelled to the odoMeter reading in KM
    public void odoAddKm(int distanceTravelled){
        this.odoKM = distanceTravelled;
    }
    
    
    // add fuel to the car
    public void addFuel(double litres, double price){
        fuelPurchase.purchaseFuel(litres, price);
    }
    
       
    
    
       
       
}
