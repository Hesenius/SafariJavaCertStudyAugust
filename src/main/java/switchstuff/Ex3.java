package switchstuff;

import java.time.LocalDate;

public class Ex3 {
  public static void main(String[] args) {
    int x = 1;
    // line n1
    switch(x) {
      case 1: LocalDate.of(2023, x, 1);
      default: LocalDate.of(2022, 12, 1);
    };
  }
}
