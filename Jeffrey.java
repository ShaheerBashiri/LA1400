package BashiriMohammad;
import robocode.*;


import robocode.JuniorRobot;


public class Jeffrey extends JuniorRobot {


	public void run() {

		setColors(yellow,red,black);

		// robot movement and moving gun 
		while (true) {
		    int heightdistance;
	        int widthdistance;
		    heightdistance = fieldHeight - robotY;
		    widthdistance = fieldWidth - robotX;
		    turnTo(0);
		    ahead(heightdistance);
			turnGunRight(90);
		    turnTo(90);
		    ahead(widthdistance);
			turnGunRight(90);
		}
	}

	// fire when we see a robot
	public void onScannedRobot() {

		turnGunTo(scannedAngle);
		fire(2);
	}
	// what will happen if we get hit
	public void onHitByBullet() {

		turnBackLeft(90, 90 - hitByBulletBearing);


	}
}