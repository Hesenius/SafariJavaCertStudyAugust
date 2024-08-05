package generalization;

/*final*/ class Base {
  void doBaseStuff() { System.out.println("doBaseStuff"); }
}

class Sub extends Base {
  void doBaseStuff() { System.out.println("doSubStuff"); }

  void length() { System.out.println("doLengthStuff"); }
}

class B2 extends Base implements Runnable {
  @Override
  public void run() {

  }
}

public class CastEx {
  public static void main(String[] args) {
//    Base b = new Base();
    Base b = new Sub();
//    Base b = new B2();
//    ((StringBuilder) b) // line n1
//        .length();      // line n2
    Runnable r = (Runnable)b;
  }
}
