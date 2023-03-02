import java.security.SecureRandom;

class Chevalier{
	public static void main(String args[]){
		one_dice();
		two_dice();
	}
	public static void one_dice(){
		int one_dice = 0;
		SecureRandom s = new SecureRandom();
		int wins = 0;
		int rolls = 1000000;
		for(int i=0;i<rolls;i+=1){
			int six = 0;
			for(int j=0;j<4;j++){
				int roll = s.nextInt(6);
				if(roll==5)six=1;
			}
			if(six==1)wins+=1;
			}
		System.out.println("Money made in one dice = "+(2*wins-rolls));
	}
	public static void two_dice(){
                int one_dice = 0,two_dice=0;
                SecureRandom s1 = new SecureRandom();
		SecureRandom s2 = new SecureRandom();
                int wins = 0;
                int rolls = 1000000;
                for(int i=0;i<rolls;i+=1){
                        int six = 0;
                        for(int j=0;j<24;j++){
                                int roll1 = s1.nextInt(6);
				int roll2 = s2.nextInt(6);
                                if(roll1==5 && roll2==5)six=1;
                        }
                        if(six==1)wins+=1;
                        }
                System.out.println("Money made in two dice = "+(2*wins-rolls));
        }
}
