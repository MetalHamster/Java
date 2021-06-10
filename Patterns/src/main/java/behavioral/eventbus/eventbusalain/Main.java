/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.eventbus.eventbusalain;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author alain.rohr
 */
public class Main
{
    public static void main(String[] args)
    {        
        DiceModel diceModel = new DiceModel();          
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(diceModel, 0, 1, TimeUnit.SECONDS);                        
        
        DiceDisplay display=new DiceDisplay();
        EventBus.INSTANCE.subscribe(display);
        
        DiceDisplay display1=new DiceDisplay();
        EventBus.INSTANCE.subscribe(display1);
       
        DiceView.main(args);                        
  
        //XView.main(args);
    }
}