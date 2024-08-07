package defaultinter;

interface IntX {
  default void doStuff() {
    System.out.println("IntX.doStuff()");
  }
}

interface IntY {
  public abstract void doStuff();
}

class ClQ implements IntX, IntY {
  public static void main(String[] args) {
    new ClQ().doTheStuff();
  }

  public void doStuff() {
    IntX.super.doStuff();
  }

  public void doTheStuff() {
    doStuff(); // line n1
  }
}

public class Ex {
}
