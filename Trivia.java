import java.util.Random;

public class Trivia{

  static boolean result=true;

  public static void main(String[] args){
    boolean[] category= new boolean[3];
    String[] name={"Math","Spongebob quotes","R's sophomore dorm video"};

    System.out.printf("Hello R! This is NO ONE.%n%nAnd I am offering you a nice deal!%n%nI will give you a TRIVIA.%n%nIf you win, you will get 1000 dollars.%n%nIf you lose, something will happen. Don't worry. It may not be that bad lol!%");

    do{
      System.out.printf("%n%nWILL YOU TAKE THE CHALLENGE? >");
      boolean choice=TextIO.getlnBoolean();
    }while (!choice);

    for (int i=0;i<3;i++){
      System.out.printf("Great!Now you have %d categories left%n",3-i);
      for (int j=0;j<3;j++){
        if (!category[j]) {System.out.printf("%d. %s%n",j+1,name[j]);}
      }
      System.out.printf("Please enter the category you wanna answer now >:");
      int a1=TextIO.getlnInt();
      category[a1-1]=true;
      if (a1==1) math();
      if (a1==2) spongeBob();
      if (a1==3) r();
    }
    if (result){
      System.out.printf("%n%nYou win!!%nGo on with your life! Good luck~~");
    }
    System.out.printf("%n%nYou lose... Good luck there lol");
  }

  /**
    pick a random element of a list of Strings
    @param list the array of Strings
    @return a randomly selected member of the list
  */
  public static String pickRandom(String[] list){
    Random random = new Random();
    int k = random.nextInt(list.length);
    return list[k];
  }


  public static void math(){
    String question=pickRandom(mathQuestion);
    System.out.printf("Welcome to the Math category.%n Here is the question:%n%s%nPlease enter your answer(Just the number please) >",question);
    int answer=TextIO.getlnInt();
    for (int i=0;i<mathQuestion.length;i++){
      if (question.equals(mathQuestion[i])){
        if (answer==mathAnswer[i]){
          System.out.printf("OMG YOU ARE A GENIUS! You got it RIGHT!");
        }else {
          result=false;
          System.out.printf("Nahh...%nThe answer is %d%nTry harder next time please lol.",mathAnswer[i]);
        }
      }
    }
  }


  public static String[] mathQuestion={
    "What is the answer for 121^2?",
    "Find x: 4x-35=(27x)/3;",
    "What is the value of 2+2?"
  };

  public static int[] mathAnswer={
    14641,
    -7,
    4
  };

  public static void spongeBob(){
    String question=pickRandom(spongeBobQuestion);
    System.out.printf("Welcome to the SpongeBob category.%n Here is the question:%n%s%nPlease enter your answer >",question);
    String answer=TextIO.getln();
    for (int i=0;i<spongeBobQuestion.length;i++){
      if (question.equals(spongeBobQuestion[i])){
        if (answer.equals(spongeBobAnswer[i])){
          System.out.printf("OMG YOU ARE A GENIUS! You got it RIGHT!");
        }else {
          result=false;
          System.out.printf("Nahh...%nThe right answer is %s.%nTry harder next time please lol.",spongeBobAnswer[i]);
        }
      }
    }
  }

  public static String[] spongeBobQuestion={
    "Who says: I wumbo, you wumbo, he she me, wumbo.",
    "Who says: This is my lab. And this is my laboratory!",
    "Who says: I'm ready! I'm ready! I'm ready!",
    "Who says: If I'm lucky,  some of Mr. Tentacles' talent will rub off on me.",
    "Who says: I can't even make a simple nutcracker.",
    "Who says: These claws aren't just for attracting mates!",
    "Who says: Meow!"
  };

  public static String[] spongeBobAnswer={
    "Patrick",
    "Plankton",
    "Spongebob",
    "Squidward",
    "Sandy",
    "Mr.Krabs",
    "Gary"
  };

  public static void r(){
    String question="What was the name of the song in R's winter sophomore dorm video?";
    System.out.printf("Welcome to the R category. It is a question about you! I am sure it will be pretty easy right?%n Here is the question:%n%s%nPlease enter your answer >",question);
    String answer=TextIO.getln();
    if (answer.equals("Minnesota")|| answer.equals("minnesota")){
      System.out.printf("OMG YOU ARE A GENIUS! You got it RIGHT!");
    }else {
      result=false;
      System.out.printf("Nahh...%nThe answer is Minnesota%nTry harder next time please lol.");
    }
  }


}