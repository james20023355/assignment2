/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclestarter;

/**
 *
 * @author 20023355
 */
public class FuelPurchase {
    
    private double fuelEconomy;
    private double litres = 0;
    private double cost = 0;
    
    public double getEconomy() {
        return fuelEconomy;
    }
  
    public double getFuel(){
        return this.litres;
    }
    
    public void setFuelEconomy(double fuelEconomy){
        this.fuelEconomy = fuelEconomy;
    }
         
    public void purchaseFuel(double amount, double price){
        this.litres += amount;
        this.cost += price;
        
    }
    
}
