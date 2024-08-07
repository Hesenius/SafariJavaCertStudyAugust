package records;

// components--formal params to "canonical" constructor
// create private final fields with these names
// and accessor methods with the same names
// cannot add arbitrary instance fields
record SalesItem(String description, int price) {
  // line n1
  // we can "replace" access methods provided
  // the signature conforms
  @Override public int price() { return price; }
  // there is no "super"
//  @Override public int price() { return super.price() + 10; }
  // statics are fine:
  static String ourStore;
  // arbitrary additional methods (static or instance) are fine too
  public int getDiscount() { return price / 10; }
}
//  Which can be added individually at line n1?
//  A) private int stockOnHand;
//  B) @Override public int price() { return price; }
//  C) @Override public int price() { return super.price() + 10; }
//  D) static String ourStore;
//  E) public int getDiscount() { return price / 10; }
public class Ex1 {
}
