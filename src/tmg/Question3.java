package tmg;

import java.util.Random;

public class Question3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GPS position1 = new GPS(3,6);
		GPS position2 = new GPS(5,5);
		
		System.out.println(isPerpendicular(position1, position2));

	}
	
	public static boolean isPerpendicular(GPS position1, GPS position2){
		
		int beamSlope = (position2.y-position1.y)/(position2.x-position1.x);
		int towerSlope = findTowerSLope();
		
		if(towerSlope==beamSlope)
			return true;
		
		return false;
	}
	
	//It finds tower leaning angle or slope, which will be useful to check beam is parallel to tower base or not 
	public static int findTowerSLope(){
		Random rand = new Random();
		
		GPS towerHigestPoint = new GPS(3,5);
		GPS towerLowsetPoint = new GPS(5,4);
		int slope = (towerLowsetPoint.y-towerHigestPoint.y)/(towerLowsetPoint.x-towerHigestPoint.x);
		return slope;
	}

}

class GPS{
	int x;
	int y;
	
	public GPS(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public static GPS getPosition(){
		Random rand = new Random();
		return new GPS(rand.nextInt(10000), rand.nextInt(10000));
	}
}
