package ca.mcgill.ecse211.t14;

/**
 * This class provides methods to search and rescue the stranded vehicle and provides methods to avoid obstacles.
 * @author ANDREW TA
 * @author SEAN TAN
 * 
 */
public class SearchAndRescue {
	/**
	 * This method locates the stranded vehicle within the search zone.
	 * Upon entering the search zone, the robot will use the provided search zone coordinates and <code>UltrasonicWatcher</code> to orient itself perpendicular to the left wall of the search zone.
	 * Using <code>LineWatcher</code>, the robot will orient itself along a grid line. The robot will then perform a sweep from that grid line toward the right direction, simultaneously polling distances.
	 * A variable <code>OBJECT_DETECTION_THRESHOLD</code> is set to a distance of 10 cm. In the case that a polled distance falls below this 10 cm threshold, a boolean variable <code>objectDetected</code> indicates that an object has been detected.
	 * From there, the robot 
	 *
	 * @author SEAN TAN
	 * @return <code>true</code> if the stranded vehicle is located successfully; <code>false</code> otherwise.
	 * 
	 */
	public static boolean searchForTheCart() {
		return true;
	}
	
	/**
	 * This method locates the point of attachment that will be used by the robot to secure the stranded vehicle for towing. 
	 * Using the light sensor and <code>ColourArbiter</code>, the robot scans the detected vehicle until it identifies the color associated with the attachment point.
	 * Assume that the attachment point has a color associated with it in the form of colored electrical tape.
	 * 
	 * @author SEAN TAN
	 * @return <code>true</code> if the attachment point is located successfully; <code>false</code> otherwise.
	 * 
	 */
	public static void locateAttachmentPoint() {
		
	}
	
	/**
	 * aligns the robot to correct angles and position before
	 * pulling the cart inside
	 */
	public static void rescueTheCart() {
		
	}
	
	/**
	 * does the us scanning to look for any obstacles
	 * @return a boolean set to true if an obstacle is detected
	 */
	public static boolean detectObstacle() {
		
		
		
		return true;
	}
	
	/**
	 * move away from the obstacles if any is detected
	 */
	public static void avoidObstacle() {
		
	}
}
