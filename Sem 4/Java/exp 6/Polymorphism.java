abstract class Calculator {
    abstract int operate(int a, int b);
}

class Operation extends Calculator {
    static void display(String operStr, int result) {
        System.out.println("Display of Operation class");
        System.out.println("Result of operation" + operStr + result);
    }

    int operate(int a, int b) {
        return 1;
    }

}

class Add extends Operation {
    static void display(String operStr, int result) {
        System.out.println("Display of Add class");
        System.out.println("Result of sum operation" + operStr + result);
    }

    int operate(int a, int b) {
        return a + b;
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        Operation add = new Add();
        Add add2 = new Add();
        add.display(" 2 + 3 = ", add.operate(2, 3));
        add2.display(" 2 + 3 = ", add2.operate(2, 3));
    }
}
