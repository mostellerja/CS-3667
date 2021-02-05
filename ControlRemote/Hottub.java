public class Hottub {
	boolean on;
	int temperature = 105;
	static final int MAXTEMP = 110;
	static final int MINTEMP = 80;

	public Hottub() {
	}

	public void on() {
		on = true;
		System.out.println("The hottub has been turned on");
	}

	public void off() {
		on = false;
		System.out.println("The hottub has been turned off");
	}

	public void bubblesOn() {
		if (on) {
			System.out.println("Hottub is bubbling!");
		} else {
			System.out.println("The hottub is off");
		}
	}

	public void bubblesOff() {
		if (on) {
			System.out.println("Hottub is not bubbling");
		} else {
			System.out.println("The hottub is off");
		}
	}

	public void jetsOn() {
		if (on) {
			System.out.println("Hottub jets are on");
		} else {
			System.out.println("The hottub is off");
		}
	}

	public void jetsOff() {
		if (on) {
			System.out.println("Hottub jets are off");
		} else {
			System.out.println("The hottub is off");
		}
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		if (on) {
			if (temperature < 80) {
				temperature = MINTEMP;
			} else if (temperature > 110) {
				temperature = MAXTEMP;
			}
			this.temperature = temperature;
			System.out.println("The temperature is now " + temperature);
		} else {
			System.out.println("The hottub is off");
		}
	}
	public void heat() {
		if (on) {
			temperature = 105;
			System.out.println("Hottub is heating to a steaming 105 degrees");
		} else {
			System.out.println("The hottub is off");
		}
	}
	public void cool() {
		if (on) {
			temperature = 98;
			System.out.println("Hottub is cooling to 98 degrees");
           
		} else {
			System.out.println("The hottub is off");
		}
	}
	public void IncrementHottubTemperature() {
		if (on) {
			if (temperature + 1 > 110) {
				System.out.println("The temperature cannot be above 110");
			} else {
				temperature++;
				System.out.println("The temperature has been increased by 1 to " + temperature);
			}
			
		} else {
			System.out.println("The hottub is off");
		}
	}
	public void DecrementHottubTemperature() {
		if (on) {
			if (temperature - 1 < 80) {
				System.out.println("The temperature cannot be below 80");
			} else {
				temperature--;
				System.out.println("The temperature has been decreased by 1 to " + temperature);
			}
			
		} else {
			System.out.println("The hottub is off");
		}
	}
}
