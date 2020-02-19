package Aiub.Lab5;

public class Bicycle2 {
	int gear;
	int speed;
	
	public Bicycle2() {
		
		
	}
	
	public Bicycle2(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
	
	
	

}



