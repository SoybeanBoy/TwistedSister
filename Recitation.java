public class Recitation{

  /**
  This method is the loop that ask R to make the PPT
  */
  public static void MakePPT(){
    System.out.println("\n'Am I going to make ppt for the recitation...?', asks R\n");
    boolean make=TextIO.getlnBoolean();
    while(!make){
      System.out.println("\nNah, I dont wanna do it today.");
      TextIO.putln("But you must do it. DO IT.\n>");
      make=TextIO.getlnBoolean();
      }
    System.out.println("\nAlright...let me get it finished.\n");
   }

/**
Those methods are written for getting the point by doing the recitation part
@return an integer that stands for the point that R got from recitation
*/
  public static int RecitationPoint(){
    MakePPT();
    System.out.println("Okayyyy let the recitation begin!!!!!");
    System.out.println("Anyone wants to answer the question?\n");
    boolean anyone=TextIO.getlnBoolean();
    System.out.println(RResponse(anyone));
    System.out.println("In a code snippet, let a=100,b=50,a=b,c=a,then what is the result of c?");
    int answer=TextIO.getlnInt();
    return PointForRecitationQuestion(answer);
  }


  public static String RResponse(boolean anyone){
    if(anyone==false){
      return ("\nAll right...let me answer the question.\n");
    }
    else{
      return ("\nOkay here is the question.\n");
    }
  }

  public static int PointForRecitationQuestion(int answer){
    if(answer==50){
      System.out.println("\nNice! Tracing is easy.\n");
      return 1;
    }
    else{
      System.out.println("\nDamn, tracing is hard... recitation is over.\n");
      return 0;
    }
  }

}
