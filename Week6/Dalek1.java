
public class Dalek1 {
	private double batteryCharge = 5.0;
	
	public void batteryReCharge(double c){
		batteryCharge = batteryCharge + c;
		System.out.println("Battery charge is:" + batteryCharge);
	}
	
	public void move(int distance){
		int count = 1;
		int remainingDistance = distance;
		while(batteryCharge >= 0.5 && remainingDistance > 0){
			System.out.print("[" + count +"] ");
			count++;
			batteryCharge -= 0.5;
			if(batteryCharge == 0){
				System.out.print("Out of power");
			}
			System.out.println();
		}
	}
}
