import java.util.Scanner;

class MyException extends Exception {
  MyException(String s) {
    super(s);
  }
}

public class CustomException {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the height : ");
    int height = (int) scn.nextInt();
    scn.close();
    try {
      if (height == 0) {
        throw new MyException("Height cannot be 0");
      }
    } catch (MyException my) {
      System.out.println(my);
    } finally {
      System.out.println("Inputted height : " + height);
    }
  }
}