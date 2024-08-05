package textblock;

public class Ex {
  public static void main(String[] args) {
    // no newline included on first line
    // must be """ followed by whitespace/newline
    // consistent indents are removed, other indents remain
    // trailing whitespace is removed
    // newline character embedded in this result is char 10 (\n)
    // escape sequences ARE processed, this is NOT a RAW string
    String message = """  
        Hello   "" "" ""\"          
            Java 17 World!""";
    System.out.println(message + "XXX");
    System.out.println(message.length());
  }
}
