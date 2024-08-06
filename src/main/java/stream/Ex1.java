package stream;

import java.util.stream.Stream;

public class Ex1 {
  public static void main(String[] args) {
    var res = Stream.generate(() -> 1)
        .limit(1000)
        .parallel()
        .reduce(1, (a, b) -> a + b, (a, b) -> a + b);
//        .collect(() -> 1, (a, b) -> a + b, (a, b) -> a + b); // need void functions!!!

    System.out.println(res);
  }
}
