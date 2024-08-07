package privaccess;

class P1 {
  public static class A1 {
    private String getMsg() {
      return "Message from A1";
    }
  }
  public static class A2 extends A1 {
    public String getMsg() { // line n1
      return "Message from A2";
    }
  }
  public static void main(String[] args) {
    P1.A1 a2 = new P1.A2(); // line n2
    System.out.println(a2.getMsg()); // line n3
  }
}