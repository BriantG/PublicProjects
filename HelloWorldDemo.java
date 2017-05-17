
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

  
  keyboard = new Scanner(System.in);
  
  line = keyboard.nextLine();
    
  test = new HelloWorld(line);

}

}
