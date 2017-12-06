public class Outcomes{
  public static void outcome(int points){
    System.out.println("'Wow' said R");
    if (points==0 or points==1){
      terribleOutcome();
    } else if (points==2){
      badOutcome();
    } else if (points==3){
      goodOutcome();
    } else {
      fantasticDay();
    }
  System.out.println("GG");
  }
  public static void terribleOutcome(){
    System.out.println("It was a terrible day for R indeed. The world has been destroyed in his eyes.");
    System.out.println("The skies were filled with dark clouds and rain poured down his face. He fell to his knees and cried out ‘WHYYYYYYY!?’");
    System.out.println("In the distance, sirens could be heard, but they did not do the common-folk’s ‘WEEWOOWEEWOO’, sound, but instead made an ‘R! WE’RE COMING TO SAVE YOU FROM YOUR DESPAIR’ sound."); 
    System.out.println("R laid upon the soaked ground, closed his eyes, and decided that tonight his bed was outside in the cold, hoping for a better tomorrow.");
  }
  public static void badOutcome(){
    System.out.println("It was a kind of bad day but R could deal with it.");
    System.out.println("R will probably just lie on his bed and meditate for a while to get rid of these bad feelings.");
    System.out.println("His efforts proved useless, but eventually he fell asleep from exhaustion.");
  }
  public static void goodOutcome(){
    System.out.println("It was a rather normal day in R’s life. Nothing disastrous happened and nothing extraordinary happened either. ");
    System.out.println("When he got home, he sat on his bed playing games on his phone, just like any ordinary day in a college student’s life.");
    System.out.println("He didn’t sleep though. No student sleeps. ");
  }
  public static void fantasticDay(){
    System.out.println("R just had his best day ever in his life!! Just like his favorite quote:");
    System.out.println("dance the night away!’, R did as his quote said, over many hills and through many fields where deer trotted by his side, R danced until his legs gave out.");
    System.out.println("The moon was shining bright. ‘This is the life. I love life’ said R.");
  }
}
