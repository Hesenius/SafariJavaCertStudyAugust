package usevar;

//class X {
//  var x = 99; // NOT for fields
//}

public class Ex1 {

//  void doStuff(var x) { }

//  void doStuff() {
//    var x;
//    x = 100;
//  }

//  void doStuff() {
//    var x = 100;
//    x = "Hello";
//    y = "Hello";
//  }

  //  void doStuff() {
//    var x = null;
//  }

  void showAll(CharSequence[] ia) {
    ia[0] = new StringBuilder(); // throws ArrayStoreException
  }
  void callIt() {
    String [] vals = {"A", "B"};
    showAll(vals);
//    showAll({"A", "B"});
    showAll(new String[]{"A", "B"});
  }

  void doStuff() {
//    var []x = {1, 2, 3};
//    var x = new long[]{1, 2, 3};

//  var x = new int[]{ 1,2,3 };
//  int [] x = { 1,2,3 };
//
//  int x = 10, y = 100; // YUP
//  var x = 10, y = 100; // NOPE
//
//  var var = "var";
//
//  for (var x : someList) {}
//
//  try {
//    if (Math.random() > 0.5) throw new SQLException();
//  } catch (var anException) {}


    // "non-denotable type" aggregate of common interfaces and
    // the closest common class ancestor!
    var x = true ? "99" : 99;
//   x.compareTo :)

   "".compareTo(null);
   Integer.valueOf(99).compareTo(null);
  }
}
