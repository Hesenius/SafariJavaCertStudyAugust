package enumstuff;

enum Day {
  MONDAY(1), TUESDAY;
// line n1
//  protected Day(int x) {} // private is redundant, anything else is prohibited
//  private Day() {}
  Day(int x) {}
  Day() {}
//  static {
//    new Day();
//  }
}

public class Ex2 {
  public static void main(String[] args) {
    System.out.println(Day.MONDAY);

    Day m = Day.valueOf("MONDAY");
    System.out.println(m == Day.MONDAY);
    System.out.println(m.equals(Day.MONDAY));
//    new Suit(1); // must never be able to do this, or we might break the enum promise
  }
}
