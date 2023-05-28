package InheritancePackage;

class Vehicles {
  String type;
  String wheels;

  Vehicles() {
    System.out.println("Vehicle class created");
  }

  Vehicles(String type, String wheels) {
    this();
    this.type = type;
    this.wheels = wheels;
  }

  void display() {
    System.out.println("Vehicle -> " + wheels + " wheelers -> " + type);

  }
}

class NoWheeler extends Vehicles {

  NoWheeler(String type, String wheels) {
    super(type, wheels);
    System.out.println(wheels + " Wheeler class created");
  }

  void display() {
    super.display();
  }

}

public class Type extends NoWheeler {
  public Type(String type, String wheels) {
    super(type, wheels);
    System.out.println(type + " class created");
  }

  public void display() {
    super.display();
  }
}
