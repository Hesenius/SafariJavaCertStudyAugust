package initialization;

import static java.lang.System.out;

class Parent {
  Parent(int x) {
    // implicit call to super(); to java.lang.Object...
    // super();
    // when you return from a call to super(...)
    // run INSTANCE INITIALIZATION for this class...

    y += x; out.print(", P-c: y is " + y);
  }
  static { out.print(", P-si: x is " + Parent.x); }
  static int x = 99;
  int y = 100;
  { y++; out.print(", P-i: y is " + y); }
}
class Child extends Parent {
//  {
//    out.println("x is " + this.x); // would be zero
//  }
  int x = 200;
  static int y = 300;
  Child() {
//    out.println("Hello");
//    super(x);  // implicitly "this.x"

    // if the first statement in a constructor is either explicit or implicit super(...) we're going up...
    super(y);
    // run instance initialization...
  }
  Child(int x) { this(); }
  { out.print(", C-i x: is " + x); }
  static { out.print(", C-si: y is " + y); }
}
public class Ex {
  public static void main(String[] args) {
    out.print("Hello!");
    new Child(-1);
    out.println(" Goodbye!");
  }

}

class Single {
  static {
    out.println("running static initliazation, self is " + Single.self);
  }
  private static Single self = new Single();
  private Single() {
    out.println("running constructor...");
  } // cannot be called from outside
  public static Single get() {
    return self;
  }
}

class TrySingle {
  public static void main(String[] args) {
    out.println("Starting");
    out.println("Class of Single is " + Single.class);
    Single s = Single.get();
    out.println("s is " + s);
  }
}