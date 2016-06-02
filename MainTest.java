import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		FlyClass obj1 = new Superman(3500,500);
		FlyClass bird = new Bird(10,3);
		FlyClass airplane = new Airplane(450,50);
		FlyClass jetplane = new Jetplane(1000,120);
		FlyClass missile = new Missile(2500,800);
		
		
		
		//Superman object
		int dTraveledPerMin = obj1.getSpeed()/60;
		
		int dTraveledPerFiveMin = dTraveledPerMin*5;
		int distanceTraveled=0;
		System.out.println("Superman is about to fly:\n");
		
		for(int i=1; i<7;i++){
		distanceTraveled = distanceTraveled + dTraveledPerFiveMin;
		System.out.printf("Supermans's distance traveled every %d min: %d miles\n",i*5,distanceTraveled);
		}
		
		int elevationPerFiveMin = obj1.getAltMeter()*5;
		System.out.println();;
		int elevationTraveled = 0;
		
		for(int i=1;i<7;i++){
			
		elevationTraveled = elevationTraveled + elevationPerFiveMin;
		System.out.printf("Superman's elevation after %d min is: %d feet\n",i*5,elevationTraveled);
		}

		//bird object
		double birddTraveledPerMin = bird.getSpeed()/60.00;
		
		double birddTraveledPerFiveMin = birddTraveledPerMin*5.00;
		double birddistanceTraveled=0.00;
		System.out.println("\nbird is about to fly:\n");
		
		for(int i=1; i<7;i++){
		birddistanceTraveled = birddistanceTraveled + birddTraveledPerFiveMin;
		System.out.printf("Bird's distance traveled every %d min: %f miles \n",i*5,birddistanceTraveled);
		}
		
		int birdelevationPerFiveMin = bird.getAltMeter()*5;
		System.out.println();;
		int birdelevationTraveled = 0;
		
		for(int i=1;i<7;i++){
			
		birdelevationTraveled = birdelevationTraveled + birdelevationPerFiveMin;
		System.out.printf("Bird's elevation after %d min is: %d \n",i*5,birdelevationTraveled);
		
	}
		
		//airplane object
				int airplanedTraveledPerMin = airplane.getSpeed()/60;
				
				int airplanedTraveledPerFiveMin = airplanedTraveledPerMin*5;
				int airplanedistanceTraveled=0;
				System.out.println("\nAirplane is about to fly:\n");
				
				for(int i=1; i<7;i++){
				airplanedistanceTraveled = airplanedistanceTraveled + airplanedTraveledPerFiveMin;
				System.out.printf("Airplane's distance traveled every %d min: %d miles \n",i*5,airplanedistanceTraveled);
				}
				
				int airplaneelevationPerFiveMin = airplane.getAltMeter()*5;
				System.out.println();;
				int airplaneelevationTraveled = 0;
				
				for(int i=1;i<7;i++){
					
				airplaneelevationTraveled = airplaneelevationTraveled + airplaneelevationPerFiveMin;
				System.out.printf("Airplane's elevation after %d min is: %d \n",i*5,airplaneelevationTraveled);
				
			}
				
				//jetplane object
				int jetplanedTraveledPerMin = jetplane.getSpeed()/60;
				
				int jetplanedTraveledPerFiveMin = jetplanedTraveledPerMin*5;
				int jetplanedistanceTraveled=0;
				System.out.println("\nJetplane is about to fly:\n");
				
				for(int i=1; i<7;i++){
				jetplanedistanceTraveled = jetplanedistanceTraveled + jetplanedTraveledPerFiveMin;
				System.out.printf("Jetplane's distance traveled every %d min: %d miles \n",i*5,jetplanedistanceTraveled);
				}
				
				int jetplaneelevationPerFiveMin = jetplane.getAltMeter()*5;
				System.out.println();;
				int jetplaneelevationTraveled = 0;
				
				for(int i=1;i<7;i++){
					
				jetplaneelevationTraveled = jetplaneelevationTraveled + jetplaneelevationPerFiveMin;
				System.out.printf("Jetplane's elevation after %d min is: %d \n",i*5,jetplaneelevationTraveled);
				
			}
				
				//missile object
				int missiledTraveledPerMin = missile.getSpeed()/60;
				
				int missiledTraveledPerFiveMin = missiledTraveledPerMin*5;
				int missiledistanceTraveled=0;
				System.out.println("\nMissile is about to fly:\n");
				
				for(int i=1; i<7;i++){
				missiledistanceTraveled = missiledistanceTraveled + missiledTraveledPerFiveMin;
				System.out.printf("Missile's distance traveled every %d min: %d miles \n",i*5,missiledistanceTraveled);
				}
				
				int missileelevationPerFiveMin = missile.getAltMeter()*5;
				System.out.println();;
				int missileelevationTraveled = 0;
				
				for(int i=1;i<7;i++){
					
				missileelevationTraveled = missileelevationTraveled + missileelevationPerFiveMin;
				System.out.printf("Missile elevation after %d min is: %d \n",i*5,missileelevationTraveled);
				
			}
			
				

}}
