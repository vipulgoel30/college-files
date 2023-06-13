interface Calculator {
    void display(int a, int b, String opera, int result);
}

interface Operation extends Calculator {
    void operate(int a, int b);
}

class Add implements Operation {
    public void display(int a, int b, String opera, int result) {
        System.out.println(a + opera + b + " = " + result);
    }

    public void operate(int a, int b) {
        display(a, b, " + ", a + b);

    }
}

public class Extend {
    public static void main(String[] args) {
        Add add = new Add();
        add.operate(2, 3);
        add.operate(4, 10);
    }
}