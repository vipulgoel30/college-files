class ImplementClass {
    void display() {
        System.out.println("Implementing class");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        ImplementClass anonymous = new ImplementClass() {
            void display() {
                System.out.println("Anonymous inner class");
            };
        };
        ImplementClass implement = new ImplementClass();
        implement.display();
        anonymous.display();
    }
}
