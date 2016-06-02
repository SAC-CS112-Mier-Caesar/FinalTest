
public class Superman implements FlyInterface{

	private int speed;
	private int elevationPM;
	
	public Superman(int speed, int elevationPM){
		this.speed = speed;
		this.elevationPM = elevationPM;
	}
	@Override
	public void setAirSpeed(int airSpeed) {
		this.speed = airSpeed;
		
	}
	
	public int getAirSpeed(){
		return speed;
	}

	@Override
	public void setAltiMeter(int elevationPM) {
		this.elevationPM=elevationPM;
		
	}
	
	public int getAltiMeter(){
		return elevationPM;
	}

	@Override
	public void fly() {
		
		
	}
	

}
