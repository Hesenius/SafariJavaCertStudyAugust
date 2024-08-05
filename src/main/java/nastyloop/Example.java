package nastyloop;

public class Example {
  public static void main(String[] args) {
    var b = (byte) 126;
    outer:
    for (var n = 1000; n < 1002; n++) {
      System.out.printf("L1: b = %d, n = %d\n", b, n);
      for (var j = 4; j >= 0; j--, b++) {
        System.out.printf("L2: b = %d, n = %d, j = %d\n", b, n, j);
        if (j < 3) break;
        else if (n == 1001) continue outer;
        b++;
        System.out.printf("L3: b = %d, n = %d, j = %d\n", b, n, j);
      }
    }
    System.out.printf("b = %d\n", b);
  }
}
