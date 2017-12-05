import java.util.Scanner;
public class StopMotion {
  public static void description(){
    System.out.print("The shower had been a worthy opponent for R this day, but now it was time for Stop Motion practice.\n");
    System.out.print("After treading down the hills of Brandeis, R arrived at Gosman to begin his training with his fellow dancers. \n");
    System.out.print("'Alright, let's get this practice done right people!' said R in a tired yet enthusiastic voice.\n");
    System.out.print("However, every good leader must be able to do what they teach. Therefore, you must help R perfect his dance routine\n");
    System.out.print("To perfect his dance routine, you must press the corresponding letters 'w' 'a' 's' or 'd' as they appear on the screen.\n");
    System.out.println("Type the wrong letter and you mess up the dance. Take too long to type and you ruin the dance by being a slowpoke and bringing the team down.");
    System.out.println("Type 'yes' when you are ready");
  }
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
  public static int dancing(int points){
    Scanner sc = new Scanner(System.in);
    boolean dance = true;
    boolean ready2 = true;
		int i = 0;
		int j = 0;
		while (ready2){
			long last = getSecs(); // Record this into last, since we'll be changing it
			long stepTime = 1000;
			while (dance && i<10){
				char[] move = {'w','a','s','d'};
				char key = move[(int)(Math.random()*4)];
				System.out.println(key);
				char input = sc.next().charAt(0); // input from user
				if (input!=key){ // they entered the wrong key! They lose!
					System.out.print("Wrong move!\n");
					dance = false;
				} else if (last + stepTime < getSecs()){
					System.out.print("You took too long and ruined the dance!\n");
					dance = false;
				} else {
					i++;
					last += stepTime; // too much time passed before they entered the key. They lose!
				}
			}
			if (i==10){
				ready2 = false;
        points = points + 100;
			} else if (j==3){
        System.out.println("You have failed the dance routine too many times. You have brought disgrace to Stop Motion.");
				ready2 = false;
			} else {
				String red2 = sc.nextLine();
				while (!red2.equals("yes")){
					System.out.print("Type 'yes' when you are ready to try again\n");
					red2 = sc.nextLine();
				}
				dance = true;
				i=0;
				j++;
			}
		}// Stuff out here will execute in a very, very fast while loop - generally don't do anything but the check
    return points;
	}
	private static long getSecs() { // Gets the time in milliseconds instead of nanoseconds
		return System.nanoTime() / 1000000;
	}
}
