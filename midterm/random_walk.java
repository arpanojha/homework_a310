import java.security.SecureRandom;

class random_walk{
	public static void main(String args[]){
		first_method();	
		third_method();
		second_method();
	}
	public static void second_method(){
	//meghan 
		int x=0,y=0;
                int i=0;
                SecureRandom s = new SecureRandom();
		for(i=0;i<100;i++){
                        int rand_x =  s.nextInt(2)>0?1:-1;
			int rand_y =  s.nextInt(2)>0?1:-1;
                        x+=rand_x;
                        y+=rand_y;
                }
                System.out.println("(0,0) to ("+x+","+y+")");
	}
	public static void third_method(){
		int x=0,y=0;
		int i=0;
		int[] dir = {-1,1};
		SecureRandom s = new SecureRandom();
		for(i=0;i<100;i++){
			int rand_x = s.nextInt(2);
			x+=dir[rand_x];
			rand_x = s.nextInt(2);
			y+=dir[rand_x];
		}
		System.out.println("(0,0) to ("+x+","+y+")");
	}
	public static void first_method(){
         // Does not satisfy all parameters of the question 
	 // Movement in 9 directions
		int x = 0,y = 0;
		int i=0;
		SecureRandom s = new SecureRandom();
		for(i=0;i<100;i+=1){
			int x_movement = 1-s.nextInt(3);
			int y_movement = 1-s.nextInt(3);
			x+= x_movement;
			y+= y_movement;
		}
		System.out.println("(0,0) to ("+x+","+y+")"); 

	}
}
