/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

import java.util.Random;

/**
 *
 * @author niroth
 */
public class StartMain {
    public static void main(String[] args) throws InterruptedException {
        ControlRoom controlRoom=new ControlRoom();
        controlRoom.addWaterLevelObserver(new Alarm());
        controlRoom.addWaterLevelObserver(new Display());
        controlRoom.addWaterLevelObserver(new SMSSender());
        
        Random r=new Random();
        while(true){
            int rand=r.nextInt(101);
            controlRoom.setWaterLevel(rand);
            Thread.sleep(2000);
        }
    }
}
