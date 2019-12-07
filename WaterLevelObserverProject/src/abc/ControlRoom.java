/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

import java.util.ArrayList;

/**
 *
 * @author niroth
 */
public class ControlRoom {
    private ArrayList <WaterLevelObserver>observers=new ArrayList<>();
    private int waterLevel;
    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        observers.add(waterLevelObserver);
    }
    public void removeWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        observers.remove(waterLevelObserver);
    }
    public void notifyObservers(){
        for (WaterLevelObserver observer : observers) {
            observer.update(waterLevel);
        }
    }
    public void setWaterLevel(int waterLevel){
        if(this.waterLevel!=waterLevel){
            this.waterLevel=waterLevel;
            notifyObservers();
        }
    }
}

