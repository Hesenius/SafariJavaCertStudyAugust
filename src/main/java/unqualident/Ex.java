package unqualident;

class Parent {
  static int x = 97;
}
class Thing extends Parent {
  static int x = 99;

//  static void showIt(Thing t) {
////    int x = 98;
//    System.out.println("x is " + t.x);
//  }
  static void showIt() {
//    int x = 98;
    System.out.println("x is " + Thing.x);
    System.out.println("x is " + Parent.x);
    Parent p = null;
    System.out.println(p.x);
  }
}

public class Ex {
  public static void main(String[] args) {
    Thing.showIt();
  }
}
