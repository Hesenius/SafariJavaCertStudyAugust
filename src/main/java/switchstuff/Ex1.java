package switchstuff;

public class Ex1 {
  public static void main(String[] args) {
    String obj = "Hello";
//    Object obj = "Hello";
//    String obj = null;
    switch(obj) { // line n1
      case "Hello" -> System.out.println(obj); // line n2
      default -> System.out.println("something else");
    }

    Integer i = 99;
    switch (i) {
      case 99 -> System.out.println("Hello, I'm an int");
    }
  }
}
