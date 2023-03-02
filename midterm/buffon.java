import java.security.SecureRandom;
import java.lang.Math;
class buffon{
	public static void main(String args[]){
		SecureRandom s1 = new SecureRandom();
		SecureRandom s2 = new SecureRandom();
		double y_low = 0;
		double angle = 0;
		int tries = 10000;
		int hits = 0;
		for(int i=0;i<tries;i++){
			y_low = s1.nextDouble()*2;
			angle  = Math.toRadians(s2.nextDouble()*180);
			double y_high = y_low + Math.sin(angle);
			if(y_high>=2)hits+=1;
		}
		System.out.println("Pi = "+((double)tries/hits));
	}
}
