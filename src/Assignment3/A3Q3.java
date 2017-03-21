/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.*;

/**
 *
 * @author birss0828
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city called kitchener

        City kitchener = new City(4, 7);

        //create robot named romo

        Robot romo = new Robot(kitchener, 1, 1, Direction.EAST);

        //creating walls

        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 1, 3, Direction.NORTH);
        new Wall(kitchener, 1, 4, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 3, 1, Direction.WEST);
        new Wall(kitchener, 3, 1, Direction.SOUTH);
        new Wall(kitchener, 3, 2, Direction.SOUTH);
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        new Wall(kitchener, 3, 4, Direction.SOUTH);
        new Wall(kitchener, 1, 4, Direction.EAST);
        new Wall(kitchener, 2, 4, Direction.EAST);
        new Wall(kitchener, 3, 4, Direction.EAST);

        //creating things

        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 2, 2);
        new Thing(kitchener, 2, 3);
        new Thing(kitchener, 2, 4);
        new Thing(kitchener, 3, 1);
        new Thing(kitchener, 3, 4);
          //this happens if the statement is true
        while (true) {
            romo.move();
            //if romo can pick things
            if (romo.canPickThing()) {
                romo.pickThing();
          }
           //romo picks thins if not on Avenue 1 and if front is clear
            while (romo.frontIsClear() && romo.getAvenue() != 1) {
                if (romo.canPickThing()) {
                    romo.pickThing();
                }
                romo.move();

            }
            if (romo.canPickThing()) {
                romo.pickThing();
            }
                //if not on Avenue 1 and if  front isn't clear tje robot will turn around
            if (!romo.frontIsClear() && romo.getAvenue() != 1) {
                romo.turnLeft();
                romo.turnLeft();
            }
            if (romo.canPickThing()) {
                romo.pickThing();
            }
            if (!romo.frontIsClear() && romo.getAvenue() == 1) {
                romo.turnLeft();

                if (romo.frontIsClear()) {
                    romo.move();
                    romo.turnLeft();
                } else {
                    romo.turnLeft();
                    romo.turnLeft();
                }

            }
            if (romo.getAvenue() == 1 && romo.getStreet() == 1 && romo.getDirection() == Direction.EAST) {
                break;
            }
        }
    }
}
