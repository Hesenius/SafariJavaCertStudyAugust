package patterninstanceof;


import java.util.Collection;
import java.util.List;

public class Ex {
  public static void main(String[] args) {
    Iterable<String> is = List.of("a", "b", "c");
    Object obj = is;

    System.out.println(is instanceof List);
    System.out.println(obj instanceof List l && l.size() > 2);
//    System.out.println(obj instanceof List<String> ls);
    System.out.println(is instanceof Collection<? extends CharSequence> cs);
//    System.out.println(is instanceof List<String> ls || ls.size() > 2);
  }
}
