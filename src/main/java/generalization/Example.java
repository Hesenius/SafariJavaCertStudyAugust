package generalization;

class Animal {
  @Override
  public String toString() {
    return "An animal";
  }
}

class Feline extends Animal {
  @Override
  public String toString() {
    return "Some feline";
  }
}

class Moggie extends Feline {
  @Override
  public String toString() {
    return "A moggie";
  }
  public void petMe() {
    System.out.println("purr purr, bite");
  }
}

class Spider extends Animal {}

public class Example {
  public static void main(String[] args) {
    Object a = new Moggie();
//    Object a = new Spider();
//    Moggie mog = new Spider(); // no
//    Moggie mog = new Animal(); // no
    // dynamic, late, polymorphic binding ONLY HAPPENS
    // for non-final instance methods.
    // NEVER for any fields!!!!
    // nor non-overrideable methods (which are static, or final)
    System.out.println(a.toString());
//    m.petMe();

    if (a instanceof Moggie) {
      System.out.println("its a moggie");
      Moggie m1 = (Moggie)a;
      m1.petMe();
    } else {
      System.out.println("not a moggie");
    }

    if (a instanceof Moggie moggie) {
      moggie.petMe();
    } else {
//      moggie // not in scope
    }

    Object obj2 = null;
    if (obj2 instanceof Moggie m) {
      System.out.println("surprising");
    } else {
      System.out.println("Nope, not a moggie");
    }
  }
}
