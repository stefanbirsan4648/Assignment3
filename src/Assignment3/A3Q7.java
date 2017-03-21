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
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create City called kitchener
        City kitchener = new City();
        //Create Robot 
        Robot romo = new Robot(kitchener, 3, 3, Direction.SOUTH);

        //Create Walls
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        new Wall(kitchener, 2, 2, Direction.SOUTH);
        new Wall(kitchener, 2, 2, Direction.EAST);
        new Wall(kitchener, 1, 2, Direction.EAST);

        new Wall(kitchener, 1, 4, Direction.NORTH);
        new Wall(kitchener, 1, 5, Direction.NORTH);
        new Wall(kitchener, 1, 4, Direction.WEST);
        new Wall(kitchener, 2, 4, Direction.WEST);
        new Wall(kitchener, 2, 4, Direction.SOUTH);
        new Wall(kitchener, 2, 5, Direction.SOUTH);
        new Wall(kitchener, 2, 5, Direction.EAST);
        new Wall(kitchener, 1, 5, Direction.EAST);

        new Wall(kitchener, 4, 1, Direction.NORTH);
        new Wall(kitchener, 4, 2, Direction.NORTH);
        new Wall(kitchener, 4, 1, Direction.WEST);
        new Wall(kitchener, 5, 1, Direction.WEST);
        new Wall(kitchener, 5, 1, Direction.SOUTH);
        new Wall(kitchener, 5, 2, Direction.SOUTH);
        new Wall(kitchener, 4, 2, Direction.EAST);
        new Wall(kitchener, 5, 2, Direction.EAST);

        new Wall(kitchener, 4, 4, Direction.NORTH);
        new Wall(kitchener, 4, 5, Direction.NORTH);
        new Wall(kitchener, 4, 4, Direction.WEST);
        new Wall(kitchener, 5, 4, Direction.WEST);
        new Wall(kitchener, 5, 4, Direction.SOUTH);
        new Wall(kitchener, 5, 5, Direction.SOUTH);
        new Wall(kitchener, 5, 5, Direction.EAST);
        new Wall(kitchener, 4, 5, Direction.EAST);
        //create counter
        int outside = 0;
        while (outside < 4) {
            int count = 0;
            while (count < 4) {
                //make romo move
                romo.move();
                romo.move();
                romo.move();
                if (count < 3) {
                    romo.turnLeft();
                }
                count = count + 1;
            }
            outside = outside + 1;
        }

    }
}
