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
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create city called kitchener
        City kitchener = new City();
kitchener.showThingCounts(true);
        //New Robot

        Robot romo = new Robot(kitchener, 3, 2, Direction.EAST);

        //create 10 things
        new Thing(kitchener, 3, 2);
        new Thing(kitchener, 3, 2);
        new Thing(kitchener, 3, 2);
        new Thing(kitchener, 3, 2);
        new Thing(kitchener, 3, 2);
        new Thing(kitchener, 3, 2);
        new Thing(kitchener, 3, 2);
        new Thing(kitchener, 3, 2);
        new Thing(kitchener, 3, 2);
        new Thing(kitchener, 3, 2);


        int count = 0;
        while (count < 10) {
            romo.pickThing();
            romo.move();
            romo.putThing();
            romo.turnLeft();
            romo.turnLeft();
            romo.move();
            romo.turnLeft();
            romo.turnLeft();
            count = count + 1;
        }
        romo.move();

    }
}
