/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author birss0828
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create city called kitchener

        City kitchener = new City();

        //Creating a Robot

        RobotSE romo = new RobotSE(kitchener, 4, 1, Direction.EAST);

        //Create walls

        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 3, 1, Direction.WEST);
        new Wall(kitchener, 4, 1, Direction.SOUTH);
        new Wall(kitchener, 4, 2, Direction.SOUTH);
        new Wall(kitchener, 4, 3, Direction.SOUTH);
        new Wall(kitchener, 4, 4, Direction.SOUTH);
        new Wall(kitchener, 1, 4, Direction.EAST);
        new Wall(kitchener, 2, 4, Direction.EAST);
        new Wall(kitchener, 1, 3, Direction.NORTH);
        new Wall(kitchener, 1, 4, Direction.NORTH);
        new Wall(kitchener, 4, 1, Direction.WEST);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 4, 4, Direction.EAST);

        // move and break if front will be clear
        while (romo.frontIsClear()) {
            romo.move();
        }
        if (!romo.frontIsClear()) {
            romo.turnLeft();
            romo.move();
           romo.turnRight();
        }
        while (!romo.frontIsClear()) {
            romo.turnLeft();
            if (romo.frontIsClear()) {
                romo.move();
                romo.turnLeft();
                romo.turnLeft();
            }
            if (romo.frontIsClear()) {
                romo.move();
            }
        }
    }
}
