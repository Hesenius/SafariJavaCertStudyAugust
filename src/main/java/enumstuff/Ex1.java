package enumstuff;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

interface GameDescriptor {
  int x = 99; // implicitly static...
  String gameType();
}

abstract class GD { public abstract String gameType(); }

enum Suit implements GameDescriptor {
  HEARTS {
    boolean isTrumps() { return true; }
  },
  /*HEARTS,*/ DIAMONDS, CLUBS, SPADES;
//  static Suit trumps = null;
  // line n1
//  boolean isTrumps() { return this == HEARTS; }
  /*final*/ boolean isTrumps() { return false; }
//  void
  class Strange {}
  public String gameType() { return "Cards"; }
}

public class Ex1 {
  public static void main(String[] args) throws Throwable {
    Class<?> cl = GameDescriptor.class;

    Field f = cl.getDeclaredField("x");
    if (((f.getModifiers() & Modifier.STATIC) == Modifier.STATIC)) {
      System.out.println("It's static...");
    }


    cl = Suit.class;
    Method m = cl.getDeclaredMethod("isTrumps");
    if (((m.getModifiers() & Modifier.STATIC) == Modifier.STATIC)) {
      System.out.println("It's static...");
    } else {
      System.out.println("Not static...");
    }

    System.out.println("parent class is " + cl.getSuperclass().getName());

    if ((cl.getModifiers() & Modifier.FINAL) == Modifier.FINAL) {
      System.out.println("It's final");
    } else {
      System.out.println("not final...");
    }

    Class<?> cl2 = Suit.HEARTS.getClass();
    System.out.println(cl == cl2);
    System.out.println(cl == Suit.CLUBS.getClass());

    Class<?> cl3 = Suit.Strange.class;
    System.out.println(cl3.getModifiers() & Modifier.STATIC);
  }
}
