package sealedstuff;

import java.sql.SQLOutput;

// permits is optional ONLY when all subtypes are in the same source file
// If sealed type hierarchy is used in a modular environment, all permitted
// types must be in the same module
// Otherwise, all permitted types must be in the same PACKAGE
sealed interface Transporter /*permits Truck, Car, Bicycle*/ {}

// permitted types must be either: final, sealed, or non-sealed
// record types are implicitly final, but can only implement interfaces
// enums are not implicitly final, but sufficiently similar they're allowed
final class Truck implements Transporter {
  private int payload;

  public Truck(int payload) {
    this.payload = payload;
  }

  public int getPayload() {
    return payload;
  }
}

//class BoxVan extends Truck {} // nope, not if Truck is final!!

non-sealed class Car implements Transporter {
  private int seatCount;

  public Car(int seatCount) {
    this.seatCount = seatCount;
  }

  public int getSeatCount() {
    return seatCount;
  }
}

sealed class Bicycle implements Transporter permits Schwinn {}

final class Schwinn extends Bicycle {}

public class Example {

  public static boolean canCarry(Transporter t, int weight) {
    boolean canCarry = true;
    if (t instanceof Truck tr) {
      canCarry = tr.getPayload() >= weight;
    } else if ( t instanceof Car c) {
      canCarry = 170 * (c.getSeatCount() - 1) > weight;
    }
    return canCarry;

    // JAVA 21
//    switch (t) {
//      case Truck tr -> System.out.println("truck");
//      case Car c -> System.out.println("car");
//      // not having Bicycle listed here would break this code.
//    }
  }

}
