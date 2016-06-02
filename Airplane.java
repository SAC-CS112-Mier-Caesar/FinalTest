
public class Airplane implements FlyInterface {

	private int speed;
	private int elevationPM;
	public Airplane(int speed, int elevationPM) {
		this.speed=speed;
		this.elevationPM=elevationPM;
	

}

	@Override
	public void setAirSpeed(int airSpeed) {
		this.speed=airSpeed;
		
	}

	@Override
	public void setAltiMeter(int elevationPM) {
		this.elevationPM=elevationPM;
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
	public int getAirSpeed(){
		return speed;
	}
	
	public int getAltiMeter(){
		return elevationPM;
	}
	
}
