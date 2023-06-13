class Base {
  synchronized void printno() {
    for (int i = 1; i <= 3; i++) {
      System.out.println(i);
    }
  }

  synchronized void printChar() {
    for (int i = 1; i <= 3; i++) {
      System.out.println((char) (96 + i));
    }
  }
}

class ThreadClass extends Thread {
  Base b;

  ThreadClass(Base b) {
    this.b = b;
  }

  public void run() {
    System.out.println("Thread using thread class : " + this.getName());
    b.printno();
  }

}

class ThreadRunn implements Runnable {
  Base b;

  ThreadRunn(Base b) {
    this.b = b;
  }

  public void run() {
    System.out.println("Thread using runnable interface : " + Thread.currentThread().getName());
    b.printChar();
  }

}

public class ThreadImplement {
  public static void main(String[] args) {
    try {
      Base b = new Base();
      ThreadClass tc = new ThreadClass(b);

      ThreadRunn tr = new ThreadRunn(b);
      Thread t = new Thread(tr);

      t.setPriority(10);
      tc.start();
      t.start();
      tc.join();
      t.join();
      System.out.println("Thread created using thread class isAlive() : " + tc.isAlive());

      System.out.println("Thread created using thread class isAlive() : " + tc.isAlive());
      System.out.println("Thread created using runnable interface priority : " + t.getPriority());

      System.out.println("Main thread");

    } catch (InterruptedException e) {
      System.out.println("Interrupted exception has occur");
    }
  }

}
