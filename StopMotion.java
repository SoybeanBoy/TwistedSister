import java.util.Scanner;
public class StopMotion {
  /** a description of the game about to be played
  */
  public static void description(){
    System.out.print("Recitation had been a worthy opponent for R this day, but now it was time for Stop Motion practice.\n");
    System.out.print("After treading down the hills of Brandeis, R arrived at Gosman to begin his training with his fellow dancers. \n");
    System.out.print("'Alright, let's get this practice done right people!' said R in a tired yet enthusiastic voice.\n");
    System.out.print("However, every good leader must be able to do what they teach. Therefore, you must help R perfect his dance routine\n");
    System.out.print("To perfect his dance routine, you must press the corresponding letters 'w' 'a' 's' or 'd' as they appear on the screen and press ENTER.\n");
    System.out.println("Type the wrong letter and you mess up the dance. Take too long to type and you ruin the dance by being a slowpoke and bringing the team down.");
    System.out.println("Type 'yes' when you are ready");
  }
  /** read check before the game starts
  no parameters or return values
  */
  public static void readyCheck(){
    boolean ready = false;
		Scanner sc = new Scanner(System.in);
		String red = sc.next();
		while (!ready){
			if (red.equals("yes")){
				ready = true;
			} else {
				System.out.println("Type 'yes' when you are ready");
				red = sc.next();
			}
		}
  }
  /** a method for the timed dancing game for R
  @return an integer for the amount of points that contributes towards
  the endgame result
  */
  public static int dancing(){
    Scanner sc = new Scanner(System.in);
    int points =  0;
    boolean dance = true;
    boolean ready2 = true;
		int i = 0;
		int j = 0;
		while (ready2){
			long last = getSecs(); // time
			long stepTime = 1000; // additional time passing
			while (dance && i<10){
				char[] move = {'w','a','s','d'};
				char key = move[(int)(Math.random()*4)];
				System.out.println(key);
				char input = sc.next().charAt(0); // input from user
				if (input!=key){ // they entered the wrong key! They lose!
					System.out.print("Wrong move!\n");
					dance = false;
				} else if (last + stepTime < getSecs()){ // too much time passed before they entered the key. They lose!
					System.out.print("You took too long and ruined the dance!\n");
					dance = false;
				} else {
					i++;
					last += stepTime; // successful round
				}
			}
			if (i==10){
				ready2 = false;
        System.out.println("You nailed it!!\n\n");
        points = 1;
			} else if (j==3){
        System.out.println("You have failed the dance routine too many times. You have brought disgrace to Stop Motion. Practice is over\n\n");
				ready2 = false;
        points = 0;
			} else {
				String red2 = sc.nextLine();
				while (!red2.equals("yes")){
					System.out.print("Type 'yes' when you are ready to try again\n"); // checks for input before starting the round again
					red2 = sc.nextLine();
				}
				dance = true;
				i=0;
				j++;
			}
		}// Stuff out here will execute in a very, very fast while loop - generally don't do anything but the check
    return points;
	}
  /** method for the timed game with the amount of time passing
  @return the amount of time that is passing in real time
  */
	private static long getSecs() { // Gets the time in milliseconds instead of nanoseconds
		return System.nanoTime() / 1000000;
	}
  public static int thirdGame(){
  int points = 0;
  description();
  readyCheck();
  points = dancing();
  return points;
}
}
