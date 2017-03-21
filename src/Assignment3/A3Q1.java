/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author birss0828
 */
public class A3Q1 {
    private static int counter;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create city called kitchener
        
         City kitchener = new City(2,7);

        //Create a Robot

        Robot romo = new Robot(kitchener, 1, 0, Direction.EAST);
        
        //create a wall
        
        new Wall(kitchener,1,5,Direction.EAST);
        
        //Create thing
         new Thing(kitchener, 1, 6);
         
         //move 5 times using a condition
        while(romo.frontIsClear()){
    
            //move
            romo.move();{
        }
        }
        
            
        
    }
}

                
            
            
        
       
            
       
        
            
        
        
            
        
    
        
    
           
    

    
        
    
