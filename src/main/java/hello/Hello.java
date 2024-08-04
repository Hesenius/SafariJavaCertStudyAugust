package hello;

sealed interface X permits Hello {}

public final class Hello implements X {
  public static void main(String[] args) {
    System.out.println("Hello Java 17 World!");
  }
}
