public class CeilingFan {
	String location = "";
	int level;
	int prevLevel;
	public static final int HIGH = 2;
	public static final int MEDIUM = 1;
	public static final int LOW = 0;
 
	public CeilingFan(String location) {
		this.location = location;
		level = LOW;
	}
  
	public void high() {
		// turns the ceiling fan on to high
		prevLevel = level;
		level = HIGH;
		System.out.println(location + " ceiling fan is on high");
 
	} 

	public void medium() {
		// turns the ceiling fan on to medium
		prevLevel = level;
		level = MEDIUM;
		System.out.println(location + " ceiling fan is on medium");
	}

	public void low() {
		// turns the ceiling fan on to low
		prevLevel = level;
		level = LOW;
		System.out.println(location + " ceiling fan is on low");
	}
 
	public void off() {
		// turns the ceiling fan off
		prevLevel = level;
		level = 0;
		System.out.println(location + " ceiling fan is off");
	}
 
	public int getSpeed() {
		return level;
	}
	public void prevState() {
		if(prevLevel == 0) off();
        else if (prevLevel == 1) low();
        else if (prevLevel == 2) medium();
        else if (prevLevel == 3) high();
        else System.out.println("There is no previous state");
	}
}
