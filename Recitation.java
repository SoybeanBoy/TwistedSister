public class recitation{

  /**
  This method is the loop that ask R to make the PPT
  */
  public static void MakePPT(){
    System.out.println("Am I going to make ppt for the recitation...?");
    boolean make=TextIO.getlnBoolean();
    while(!make){
      System.out.println("Nah, I dont wanna do it today.");
      TextIO.putln("But you must do it. DO IT.");
      make=TextIO.getlnBoolean();
      }
    System.out.println("Alright...let me get it finished.");
   }

/**
Those methods are written for getting the point by doing the recitation part
@return an integer that stands for the point that R got from recitation
*/
  public static int RecitationPoint(){
    MakePPT();
    System.out.println("Okayyyy let the recitation begin!!!!!");
    System.out.println("Anyone wants to answer the question?");
    boolean anyone=TextIO.getlnBoolean();
    System.out.println(RResponse(anyone));
    System.out.println("In a code snippet,let a=100,b=50,a=b,c=a,then what is the result of c?");
    int answer=TextIO.getlnInt();
    return PointForRecitationQuestion(answer);
  }


  public static String RResponse(boolean anyone){
    if(anyone==false){
      return ("All right...let me answer the question.");
    }
    else{
      return ("Okay here is the question.");
    }
  }

  public static int PointForRecitationQuestion(int answer){
    if(answer==50){
      return 100;
    }
    else{
      return 10;
    }
  }

}
