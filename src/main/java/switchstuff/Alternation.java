package switchstuff;

public class Alternation {
  public static void main(String[] args) {
    int x = 99;
    switch (x) {
//      case 98:
//      case 99:
//      case 100:
//      case 98, 99, 100:
      case 98, 99, 100 ->
        System.out.println("it's about 99ish");
    }
  }
}
