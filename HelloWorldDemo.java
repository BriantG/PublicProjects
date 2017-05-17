
import java.util.Scanner;

class HelloWorld {

    public HelloWorld()
    {
        System.out.println("Hello! ");
    }

    public HelloWorld(String name)
    {
        System.out.println("Hello " + name);
    }
}

public class HelloWorldDemo {

  public static void main(String[] args)
  {
  HelloWorld test = null;

  Scanner keyboard = null;

  String line = "";
   
  String prompt = "";
  
  
  
      keyboard = new Scanner(System.in);
  
      prompt = "Please enter your name";

      System.out.println(prompt);
      
      line = keyboard.nextLine();
    
  test = new HelloWorld(line);

}

}
