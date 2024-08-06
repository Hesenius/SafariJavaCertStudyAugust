package stream;

import java.util.stream.*;

record Customer(String name, int credit) {
}

public class Ex2 {
  public static void main(String[] args) {
//    var result = Stream.of(new Customer("Fred", 100))
//        .collect(Collectors.groupingBy(c -> c.name(),
//            Collectors.counting()));

    var map = Stream.of(
            new Customer("Fred", 100),
            new Customer("Fred", 300),
            new Customer("Inaya", 20_000))
        .collect(Collectors.groupingBy(c -> c.name(), Collectors.counting()));
    map.entrySet().forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));

  }
}
