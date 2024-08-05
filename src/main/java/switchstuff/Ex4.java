package switchstuff;

import java.time.LocalDate;

public class Ex4 {
  public static void main(String[] args) {
    int x = 1;
    // line n1
//    var d =
//    switch(x) {
////      case 1: LocalDate.of(2023, x, 1);
////      default: LocalDate.of(2022, 12, 1);
//      case 1: yield LocalDate.of(2023, x, 1);
//      default: yield LocalDate.of(2022, 12, 1);
//    };
    var d = switch(x) {
      case 1 -> {
        int year = 2023;
//        if (Math.random() > 0.5) break; // NO BREAK IN EXPRESSION
        if (Math.random() > 0.5) throw new RuntimeException();
        yield LocalDate.of(year, x, 1);
      }
      default -> LocalDate.of(2022, 12, 1);
    };

//    int goto; // NOPE this is an keyword
//    int const;
//    int assert;

//    int var = 0;
    var var = "var"; // context sensitive special identifier
    Thread.yield();
  }
}

//class var {}
class Var {}