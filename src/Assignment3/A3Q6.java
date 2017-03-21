/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author birss0828
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create city called kitchener
        City kitchener = new City();
        
        
        kitchener.showThingCounts(true);
        //Create Robot named romo
        Robot romo = new Robot(kitchener,0,1,Direction.SOUTH);
        //Create things
        new Thing(kitchener,1,1);
        new Thing(kitchener,1,1);
        new Thing(kitchener,1,1);
        new Thing(kitchener,2,1);
        new Thing(kitchener,2,1);
        new Thing(kitchener,3,1);
        new Thing(kitchener,3,1);
        new Thing(kitchener,3,1);
        new Thing(kitchener,3,1);
        new Thing(kitchener,3,1);
        new Thing(kitchener,4,1);
        new Thing(kitchener,4,1);
        new Thing(kitchener,4,1);
        new Thing(kitchener,4,1);
            
        
            while(romo.putT()){
                romo.putThing();
                romo.move();
                
            }{
                
            }
    }
    }
    
    
 


