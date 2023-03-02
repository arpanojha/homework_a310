import java.util.*; 

public class nim_audrestch {
  int marbles; 
  public void smartMove() {
    if ((":63:31:15:7:3:").contains(":" + this.marbles + ":")) 
      this.randomMove();
    else if (this.marbles > 63) this.marbles = 63; 
    else if (this.marbles > 31) this.marbles = 31; 
    else if (this.marbles > 15) this.marbles = 15; 
    else if (this.marbles >  7) this.marbles =  7; 
    else if (this.marbles >  3) this.marbles =  3; 
    else if (this.marbles >  1) this.marbles = 1;
    else {
      System.out.println("I refuse to move.");  
    }
    System.out.println("Computer moves and pile is now: " + this.marbles);
  }
  public void randomMove() {
    int howMany = (int) (Math.random() * (this.marbles / 2)) + 1; 
    this.marbles -= howMany; 
    System.out.println("Computer moves " + howMany + " and pile is now: " + this.marbles);
  }
  public void play() {
    this.marbles = (int)(100 * Math.random() + 1); 
    System.out.println( this.marbles ); 
    int order = 0; // computer moves 
    String intel = Math.random() > 0.5 ? "smart" : "random";
    System.out.println("The computer's moves are " + intel); 
    while (this.marbles > 1) {
      if (order == 0) { // computer moves 
        if (intel.equals("smart")) smartMove();  
        else randomMove();
      } else { // user moves
        System.out.print("Move: "); 
        this.marbles -= Integer.parseInt((new Scanner(System.in)).nextLine());
        System.out.println("Pile now: " + this.marbles); 
      }
      order = (order + 1) % 2;        
    }
    if (order == 0) System.out.println("Computer loses."); 
    else System.out.println("Human loses."); 
  }
  public static void main(String[] args) {
    Audretsch game = new Audretsch(); 
    game.play(); 
  }
}
