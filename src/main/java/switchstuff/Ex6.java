package switchstuff;

enum Suit {
  HEARTS, DIAMONDS, SPADES, CLUBS;
}

public class Ex6 {
  public static void main(String[] args) {
    Suit s = Suit.CLUBS;
    System.out.println(switch (s) {
      case HEARTS, DIAMONDS -> "Red card";
      case SPADES, CLUBS -> "Black card";
    });

    int x = (int)(Math.random() * 5);
    System.out.println(switch (x){
      case 0, 1, 2 -> "small";
      case 3, 4 -> "larger";
      default -> throw new RuntimeException("impossible!");
    });
  }
}
