package switchstuff;

public class Ex2 {
  public static void main(String[] args) {
    String s = "Hello";
    switch (s) {
//      case "Hello" ->
////        System.out.print("Bonjour "); // line n1
//        System.out.print("Guten Tag ");
      case "Hello" -> {
        System.out.print("Bonjour "); // line n1
        if (Math.random() > 0.5) break;
        System.out.print("Guten Tag ");
      }
      default -> System.out.print("Bye");
    }

    switch (s) {
      case "Hello":
        int x = 99;
        System.out.println(s + " " + x);
      case "Goodbye":
        x = 100;
        System.out.println("Message" + s + " x is " + x);
    }

    for (var x = 0; x < 10; x++) {

    }
  }
}
