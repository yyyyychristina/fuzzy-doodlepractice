package demoShowCurrentTimePackage;

public class ShowCurrentTimeClass {

	public static void main(String[] args) {
		// obtain millisecond from midnight of Jan, 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		//obtain totalSeconds from totalMilliseconds
		long totalSeconds = totalMilliseconds % 1000;
		
		//obtain currentSeconds from total second
		long currentSeconds = totalSeconds % 60;
		
		//obtain totalMinutes from totalSeconds
		long totalMinutes = totalSeconds / 60;
		
		//obtain currentMinutes from totalMinutes
		long currentMinutes = totalMinutes % 60;
		
		//obtain totalHours from totalMinutes
		long totalHours = totalMinutes / 60;
		
		//obtain currentHours from totalHours
		long currentHours = totalHours / 24;
		
		//Display results
		System.out.println("Current time is: " + currentHours + ":" + currentMinutes + 
				":" + currentSeconds + "GMT");
		
		
		
		
		
	}

}
