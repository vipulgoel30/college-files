import java.util.Scanner;

class MyException extends Exception {
  String message;

  MyException(String s) {
    super();
    this.message = s;
  }

  public void display() {
    System.out.println(this.message);
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
      my.display();
    } finally {
      System.out.println("Inputted height : " + height);
    }
  }
}