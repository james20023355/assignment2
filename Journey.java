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
public class Journey {
    private double kilometers;
    
    public Journey(){
        this.kilometers = 0;
    }
    
    public void addKilometers(double kilometers){
        this.kilometers += kilometers;
    }
    
    public double getKilometers(){
        return kilometers;
    }
}
