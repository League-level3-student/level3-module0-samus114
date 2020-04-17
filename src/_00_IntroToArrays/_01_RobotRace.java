package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
Robot rob[] = new Robot[50];
boolean endRace = false;
		//3. use a for loop to initialize the robots.
 for (int i = 0; i < rob.length; i++) {
	rob[i] = new Robot("mini");
	}
			//4. make each robot start at the bottom of the screen, side by side, facing up
	for (int i = 0; i < rob.length; i++) {
		rob[i].setX(30 * i + 20);
		rob[i].setY(580);
	}
  Random rand = new Random();
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
while (!endRace) {
	//5. use another for loop to iterate through the array and make each robot move less than 50
	for (int i = 0; i < rob.length; i++) {
		rob[i].setSpeed(10);
	    int movement = rand.nextInt(50);
			rob[i].move(movement);	
			if (rob[i].getY() <= 0) {
				endRace = true;
				//7. declare that robot the winner and throw it a party!
			System.out.println("ROBOT " + i + " HAS WON");
				break;
			}
	}
}
		
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
