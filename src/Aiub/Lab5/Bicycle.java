package Aiub.Lab5;

public class Bicycle {


	    public int gear;

	    public int speed;

	        

	    public Bicycle() {

		}

		public Bicycle(int gear, int speed) {

			this.gear = gear;

			this.speed = speed;

		}

		public void applyBrake(int decrement) {

	        speed -= decrement;

	    }      

	    public void speedUp(int increment) {

	        speed += increment;

	    }      

	}

	class MountainBike extends Bicycle {

	    public int seatHeight;

		public MountainBike() {

		}

		public MountainBike(int gear, int speed,int seatHeight) {

			super(gear, speed);

			this.seatHeight = seatHeight;

		}
		

		public void applyBrake(int decrement) {

	        speed -= decrement;

	    }


		public String toString() {

			return "MountainBike [seatHeight=" + seatHeight 

					+ ", gear=" + gear + ", speed=" + speed + "]";

		}    



	
	}
