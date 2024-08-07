package records;

// equals, hashCode, toString all created for us
// parent type is java.lang.Record, must not have an extends clause
// type is implicitly final
record Customer(String name, int id) {
  // line n1
  // canonical constructor looks like this
//  Customer(String name, int id) { // version 1
//    this.name = name;
//    this.id = id;
//  }

  // might create your own version for normalization and/or validation
//  Customer(String  myname, int id) { // component names must not be changed!!!
  Customer(String  name, int id) {
//    if (name == null || name.length() == 0) throw new IllegalArgumentException("bad name");
    // these two must exist, and almost certainly, must be last
    this.name = name;
    this.id = id;
  }

  // instead, can create "compact" constructor
//  Customer { // this code is a "prefix" to the canonical constructor in version 1
//    if (name == null || name.length() == 0) throw new IllegalArgumentException("ba name");
//    name = "Mx. " + name;
//  }

  Customer(String name) {
    this(name, 1); // must eventually delegate to the canonical constructor
  }

  Customer() {
    this("Unknown");
  }
}
/*Which are valid at line n1?
A)  Customer(String name, int id) {
  this.name = "Mx. " + name;
}

B)  Customer {
  this.name = name;
  this.id = id;
}

C)  Customer {
  if (name == null || name.length() == 0 || id < 1)
    throw new IllegalArgumentException("Bad Customer values");
  name = "Mr/Mrs/Ms " + name;
}

D)  static {}

E)  {}*/
public class Ex2 {
}
