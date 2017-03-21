/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author birss0828
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create city called kitchener

        City kitchener = new City();

        //Create a Robot

        Robot romo = new Robot(kitchener, 0, 2, Direction.WEST);

        //create a wall

        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        new Wall(kitchener, 2, 2, Direction.SOUTH);
        new Wall(kitchener, 2, 2, Direction.EAST);
        new Wall(kitchener, 1, 2, Direction.EAST);

        //Create a loop 


        romo.move();
        romo.move();
        romo.turnLeft();
        romo.move();
        //make counter
        int counter = 0;
        while (counter < 7) {
            //increase counter 
           
            romo.move();
            romo.move();
            romo.turnLeft();
            romo.move();
            counter = counter + 1;

        }


    }
}
