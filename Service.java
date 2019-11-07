/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclestarter;

import java.util.Date;

/**
 *
 * @author 20023355
 */
public class Service {
    public static final int SERVICE_KILOMETER_LIMIT = 10000;
    
    private int lastServiceOdoKM = 0;
    private int serviceCount = 0;
    private Date lastServiceDate;
    
    public int getLastServiceKM(){
        return this.lastServiceOdoKM;
    }
    
    public void recordService(int distance){
        this.lastServiceOdoKM = distance;
        this.serviceCount ++;
        this.lastServiceDate = new Date();
    }
    
    public int getServiceCount(){
        return this.serviceCount;
    }
    
    public int getTotalScheduledServices(){
        return(int) Math.floor(lastServiceOdoKM / SERVICE_KILOMETER_LIMIT);
    }
}
 