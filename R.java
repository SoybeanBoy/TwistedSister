import java.util.Scanner;

public class R{

  public static void main(String[] args){
    int points = 0;//keep track of the endings

    System.out.printf("%nYou are about to embark on a journey through a day in the life of R Matthews. Let's go!%n%n");
    String shirt = dressShirt();
    String pants = dressPants();
    points=Trivia.play()+recitation.RecitationPoint();
    Outcomes.outcome(points);
  }

  // R selects his shirt
  public static String dressShirt(){
    Scanner input = new Scanner(System.in);
    System.out.println("R opens his closet to select a shirt. His options are:");
    System.out.printf("(1)Tank top%n(2)Button down%n(3)Long sleeve%nWhat will he choose? (enter the #) ");
    int choice = input.nextInt();
    String[] shirt = {"tank top","button down","long sleeve"};
    System.out.printf("%nR selected the %s shirt.%n",shirt[choice-1]);
    return shirt[choice-1];
  }

  // R selects his pants
  public static String dressPants(){
    Scanner input = new Scanner(System.in);
    System.out.println("Now R must select pants to wear. His options are:");
    System.out.printf("(1)Shorts%n(2)Jeans%n(3)No pants%nWhat will he choose? (enter the #) ");
    int choice = input.nextInt();
    String[] pants = {"shorts","jeans","no pants"};
    System.out.printf("%nR selected %s.%n",pants[choice-1]);
    if (choice==3){
      System.out.println("That's probably a terrible idea, but we'll go with it anyway!");
    }
    return pants[choice-1];
  }


}
