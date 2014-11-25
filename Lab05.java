/**
*
* Description of the program goes here  // provide a brief description
*
* @Monica
* @11/25/14
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05 {

     public static void runTheRace(Racer arg) {
         arg.shuttle(4, 7);
         arg.shuttle(6, 5);
         arg.shuttle(8, 3);
         arg.move();
     }
     
     public static void main(String[] args) {   
     
            Display.openWorld("maps/shuttle.map");
            Display.setSize(10, 10);
            Display.setSpeed(10);
            
            Racer alex = new Racer(7);
            Racer jordan = new Racer (4);
            Racer jack = new Racer(1);
            runTheRace(alex);
            runTheRace(jordan);
            runTheRace(jack);
            
   }  

}
