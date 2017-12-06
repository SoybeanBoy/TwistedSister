package chat;

import java.util.Scanner;
import lib.StringArray;

public class Shower{
  public static void main(String[] args){
    showerIntro();
    int progress = 0; // this will keep track of our progress through the correct order
    Scanner input = new Scanner(System.in);
    String[] options = {"wrench","knife","saxophone","tweezers"};
    String[] choice = new String[1];
    while (progress < 4){
      choice[0] = input.nextLine();
      while (!StringArray.intersects(choice,options)){
        choice[0] = impossibleAnswer();
      }
      progress = possibleAnswer(choice[0],progress);
    }
      // point = 1;
  }

  public static void showerIntro(){
    System.out.println("It's been a long day, and R is ready to shower after his dance practice.");
    System.out.println("He grabs his towel and goes to take a shower, but he turns the knob and there's no water.");
    System.out.println("There's no way in hell he's filing a work order, so he decides to take plumbing matters into his own hands.");
    System.out.println("The tools he has at his disposal are a wrench, a knife, a saxophone, and tweezers.");
    System.out.println("Which will he use first?");
  }

  public static int possibleAnswer(String tool, int progress){
    if (progress == 0){
      if (tool.equals("wrench")){
        correct(tool);
        progress = 1;
      } else {
        noUse(tool);
      }
    } else if (progress == 1){
      if (tool.equals("wrench")){
        alreadyUsed(tool);
      } else if (tool.equals("tweezers")){
        correct(tool);
        progress = 2;
      } else if (tool.equals("saxophone") || tool.equals("knife")) {
        noUse(tool);
      }
    } else if (progress == 2){
      if (tool.equals("wrench") || tool.equals("tweezers")){
        alreadyUsed(tool);
      } else if (tool.equals("saxophone")){
        correct(tool);
        progress = 3;
      } else if (tool.equals("knife")){
        noUse(tool);
      }
    } else if (progress == 3){
      if (tool.equals("wrench") || tool.equals("tweezers") || tool.equals("saxophone")){
        alreadyUsed(tool);
      } else if (tool.equals("knife")){
        correct(tool);
        progress = 4;
      }
    }
    return progress;
  }

  public static String impossibleAnswer(){
    Scanner input = new Scanner(System.in);
    System.out.println("Sadly, R does not own that.");
    System.out.println("What will he use instead?");
    String choice = input.nextLine();
    return choice;
  }

  public static void alreadyUsed(String tool){
    System.out.printf("R already used the %s. There doesn't seem to be any use for it anymore.%n",tool);
    System.out.println("What will he use instead?");
  }

  public static void noUse(String tool){
    System.out.printf("There doesn't seem to be any use for the %s right now.%n",tool);
    System.out.println("What will he use instead?");
  }

  public static void correct(String tool){
    if (tool.equals("wrench")){
      System.out.println("R uses the wrench to remove the showerhead. Inside the pipe he finds... goblin droppings?");
      System.out.println("'What the hell kind of miniature goblin is leaving mini poops in my shower head??' says R.");
      System.out.println("What will he use to remove the droppings from inside the pipe?");
    } else if (tool.equals("tweezers")){
      System.out.println("R uses the tweezers to remove droppings from the pipe. Unfortunately, there are some he just can't get.");
      System.out.println("What will he use to remove the stubborn droppings from inside the pipe?");
    } else if (tool.equals("saxophone")){
      System.out.println("In a feat of musical genius, R plays a #E on Jason's groovy saxophone.");
      System.out.println("This shakes out all the remaining droppings from the pipe! His shower works again!!");
      System.out.println("However, one problem still remains. The culprit is still at large.");
      System.out.println("What will R use to slay this poopy little goblin?");
    } else {
      System.out.println("R takes out his dull knife that he keeps hidden under his sleeping bag on his bed.");
      System.out.println("Since the knife glows in the presence of goblins, he quickly finds the culprit.");
      System.out.println("Upon seeing R in nothing towel and hold a glowing knife, the goblin shrieks,");
      System.out.println("'Tis the slayer of all!! His magnificent loincloth brings death!!'");
      System.out.println("The goblin retreats and R takes a nice warm shower. :)");
    }
  }

  //insert a method that gets the options again

  // and make it so that you can just type no and R is stinky
}
